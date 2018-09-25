package less_4;

import java.util.Scanner;

/***
 * Напишите программу, которая определяет, является ли одна строка анаграммой другой строки.
 * Анаграмма - это слово или фраза, сделанная путем переноса букв другого слова или фразы.
 * Программа должна игнорировать пробелы и знаки препинания.
 *
 * Пример анаграмм:
 * Аз есмь строка, живу я, мерой остр.
 * За семь морей ростка я вижу рост.
 *
 * Я в мире — сирота.
 * Я в Риме — Ариост.
 */
public class Anagram {
    protected String strOne, strTwo, strPrepOne, strPrepTwo;
    protected char[] charArrayOne;

    public static void main(String[] args) {
        Anagram a = new Anagram();
        a.inputString();
        a.resultCompare();
    }

    private void inputString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input first string: ");
        this.strOne = scanner.nextLine();

        System.out.println("Please input second string: ");
        this.strTwo = scanner.nextLine();

        //удаляем знаки препинания
        this.strPrepOne = this.strOne.replaceAll("[^a-zA-Zа-яА-Я]", "");
        this.strPrepTwo = this.strTwo.replaceAll("[^a-zA-Zа-яА-Я]", "");

        //переводим в нижний регистр
        this.strPrepOne = this.strPrepOne.toLowerCase();
        this.strPrepTwo = this.strPrepTwo.toLowerCase();
    }

    private Boolean compareStringLength() {
        Boolean result;
        if (this.strPrepOne.length() == this.strPrepTwo.length()) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    private Boolean searchInCharArray() {
        Boolean result;
        int strLength;
        if (compareStringLength()) {
            // Строку - в массив символов
            this.charArrayOne = this.strPrepOne.toCharArray();

            // Ищем в первой строке символы и удаляем их во второй (через массив символов первой строки)
            for (int i = 0; i < this.charArrayOne.length; i++) {
                int indexStrTwo = this.strPrepTwo.indexOf(this.charArrayOne[i]);
                if (indexStrTwo >= 0) {
                    this.strPrepTwo = removeCharAt(this.strPrepTwo, indexStrTwo);
                }
            }
            strLength = this.strPrepTwo.length();

            // Если длинна модифицированной строки равна нулю, значит, строки идентичны по набору букв
            if (strLength > 0) {
                result = false;
            } else {
                result = true;
            }
        } else {
            result = false;
        }
        return result;
    }

    /**
     * Возвращаем подстроку s, которая начиная с нулевой позиции переданной строки (0) и заканчивается позицией символа (pos),
     * который мы хотим удалить, соединенную с другой подстрокой s, которая начинается со следующей позиции после позиции символа (pos + 1),
     * который мы удаляем, и заканчивается последней позицией переданной строки.
     */

    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }

    public void resultCompare(){
        if (searchInCharArray()) {
            System.out.println("String Two is an ANNAGRAM of String One");
        } else {
            System.out.println("String Two and One is NOT annagrams");
        }
    }
}
