import java.util.Scanner;

/***
 * Напишите программу определения, попадает ли указанное пользователем число от 0 до 100
 * в числовой промежуток [0 - 14], [15 - 35], [36 - 50], [50 - 100].
 * Если да, то укажите в какой именно промежуток.
 * Если пользователь указывает число, не входящее ни в один из имеющихся числовых промежутков,
 * то выводится соответствующее сообщение
 */
public class Interval {

    private static int digit;
    private static String priznakInterval = " не входит не в один из указанных интервалов ([0 - 14], [15 - 35], [36 - 50], [50 - 100])";

    private static boolean checkInput(String strResult) {
        Boolean result = false;
        if (isDigit(strResult)) {
            result = true;
        } else {
            System.out.println("Введенное выражение не является целым числом. Попробуйте еще раз: ");
        }
        return result;
    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static void enterDigit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        //Проверка на корректность введенных данных
        String strResult = scanner.next();
        if (!checkInput(strResult)) {
            enterDigit();
        } else Interval.digit = Integer.parseInt(strResult);
        scanner.close();
    }

    public static void intervalDistribution() {
        if (Interval.digit >= 0 && Interval.digit <= 14) {
            Interval.priznakInterval = " входит в интервал [0 - 14]";
        }
        if (Interval.digit >= 15 && Interval.digit <= 35) {
            Interval.priznakInterval = " входит в интервал [15 - 35]";
        }
        if (Interval.digit >= 36 && Interval.digit <= 50) {
            Interval.priznakInterval = " входит в интервал [36 - 50]";
        }
        if (Interval.digit >= 50 && Interval.digit <= 100) {
            Interval.priznakInterval = " входит в интервал [50 - 100]";
        }
    }

    public static void main(String[] args) {
        enterDigit();
        intervalDistribution();
        System.out.println("Число " + Interval.digit + Interval.priznakInterval);
    }
}
