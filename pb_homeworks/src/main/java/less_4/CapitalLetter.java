package less_4;

import java.util.Scanner;

/***
 * Напишите программу, которая принимает строку и переводит первую букву слова в верхний регистр.
 * Пример работы:
 * До: Истина — это то, что выдерживает проверку опытом. Эйнштейн А.
 * После: Истина — Это То, Что Выдерживает Проверку Опытом. Эйнштейн А.
 */

public class CapitalLetter {

    protected String strBefore, strAfter;

    public static void main(String[] args) {
        CapitalLetter cl = new CapitalLetter();
        cl.inputString();
        cl.stringToWords();
    }

    private void inputString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a string for formatting:");
        this.strBefore = scanner.nextLine();
        scanner.close();
    }

    private void stringToWords () {
        String[] subStr;
        String delimeter = " "; // Разделитель
        subStr = this.strBefore.split(delimeter);
        for(int i = 0; i < subStr.length; i++) {
            //System.out.println(subStr[i]);
            // Преобразуем строку str в массив символов (char)
            char[] strToArray = subStr[i].toCharArray();
            for(int j = 0; j < strToArray.length; j++) {
                if (j == 0) {
                    strToArray[j] = Character.toUpperCase(strToArray[j]);
                }
                System.out.print(strToArray[j]);
            }
            System.out.print(" ");
        }
    }
}
