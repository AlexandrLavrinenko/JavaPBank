package less_3;

import java.util.Random;
import java.util.Scanner;

/***
 * Программа должна загадать целое число в диапазоне от 0 до 100 и предложить пользователю его отгадать.
 * При вводе числа пользователем, программа проверяет на соответствие с загаданным число
 * и если числа совпали вывести сообщение о том что число отгадано.
 * Если числа не совпали, тогда следует вывести надпись о том,
 * что задуманное число является больше или меньше вводимого.
 * Также программа ведет подсчет попыток, и выводит это количество после того как число угадали.
 * Предусмотреть возможность досрочного завершения программы,
 * в случае, если пользователь не желает продолжать угадывать число.
 */

public class Bingo {

    private static int min = 0;
    private static int max = 100;
    private static int shot = 0;
    private static int number, userNum;

    private static void randomNumber() {
        // Инициализируем генератор
        Random rnd = new Random(System.currentTimeMillis());
        // Получаем случайное число в диапазоне от min до max (включительно)
        number = min + rnd.nextInt(max - min + 1);
    }

    public static int enterDigit(String message) {
        int result = 0;
        // Ввод информации с клавиатуры
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        //Проверка на корректность введенных данных
        String strDigit = scanner.next();
        if (!checkInput(strDigit)) {
            enterMin(); // настроить правильную переадресацию
        } else {
            result = Integer.parseInt(strDigit);
            //scanner.close();
        }
        return result;
    }

    public static void enterMin() {
        // Ввод информации с клавиатуры
        //Проверка на корректность введенных данных
        min = enterDigit("Введите МИНимальное значение диапазона: ");
    }

    public static void enterMax() {
        max = enterDigit("Введите МАКСимальное значение диапазона: ");
    }

    public static void enterUserNum() {
        userNum = enterDigit("Угадайте число в диапазоне от " + min + " до " + max + ".\nНабирайте числа и угадывайте или введите 'exit' для выхода из программы: \n");
        if (userNum == number) {
            shot++;
            System.out.println("Поздравляем! Вы угадали число " + number + " с " + shot + "-ой попытки");
        } else if (userNum < number) {
            shot++;
            System.out.println("Загаданное число больше " + userNum);
            enterUserNum();
        } else{
            shot++;
            System.out.println("Загаданное число меньше " + userNum);
            enterUserNum();
        }
    }

    private static boolean checkInput(String strResult) {
        Boolean result = false;
        if (isDigit(strResult)) {
            result = true;
        } else {
            System.out.println("Введенное выражение не является числом. Попробуйте еще раз: ");
        }
        return result;
    }

    private static boolean isDigit(String s) throws NumberFormatException {
        if (s.equals("exit")) {
            System.out.println("Выход из программы.\nВы не угадали число " + number + " и потратили " + shot + " попыток");
            System.exit(0);
        }
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        enterMin();
        enterMax();
        randomNumber();
        enterUserNum();
    }
}
