import sun.util.calendar.CalendarUtils;

import java.util.Scanner;

/**
 * Class Calculate.
 * Тестовое задание выполнение арифметических действий над двумя значениями.
 *
 * @autor alavrinenko.
 * @return double result.
 */
public class Calculator {
    /**
     * Результат вычисления.
     */
    private static double operand1,operand2, result;
    private static String sign;

    /**
     * Method add.
     * Суммируем два значения.
     *
     * @param operand1  .
     * @param operand2 .
     */
    private static void add(double operand1, double operand2) {
        Calculator.result = operand1 + operand2;
    }

    /**
     * Method subtract.
     * Вычитаем из первого второе значение.
     *
     * @param operand1  .
     * @param operand2 .
     */
    private static void subtract(double operand1, double operand2) {
        Calculator.result = operand1 - operand2;
    }

    /**
     * Method div.
     * Делим первое значение на второе.
     *
     * @param operand1  .
     * @param operand2 .
     */
    private static void div(double operand1, double operand2) {
        Calculator.result = operand1 / operand2;
    }

    /**
     * Method multip.
     * Умножаем первое значение на второе.
     *
     * @param operand1  .
     * @param operand2 .
     */
    private static void multip(double operand1, double operand2) {
        Calculator.result = operand1 * operand2;
    }

    /**
     * Method getResult.
     * Получаем результат математических действий.
     *
     * @return double result.
     */
    public double getResult() {
        return Calculator.result;
    }

    public void enterOperand1() {
        // Ввод информации с клавиатуры
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите operand1: ");
        //Проверка на корректность введенных данных
        String strResult = scanner.next();
        if (!checkInput(strResult)) {
            enterOperand1();
        }
        result = Double.parseDouble(strResult);
        this.operand1 = result;
    }

    public void enterSymbolOperation() {
        // Ввод информации с клавиатуры - первый операнд
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите символ необходимой операции: [+, -, /, *] ");
        String sign = scanner.next();

        //метод проверки на соответствие математическим символам
        if (!matchSign(sign)) {
            System.out.println("Неверно введен символ. Пожалуйста, введите символ из перечисленных - [+, -, /, *]: ");
            enterSymbolOperation();
        }

        this.sign = sign;
    }

    private Boolean matchSign(String sign) {
        Boolean result = false;
        if (sign.equals("+") || sign.equals("-") || sign.equals("/") || sign.equals("*")) {
            result = true;
        }
        return result;
    }

    public void enterOperand2() {
        // Ввод информации с клавиатуры - второй операнд
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите operand2: ");
        //Проверка на корректность введенных данных
        String strResult = scanner.next();
        if (!checkInput(strResult)) {
            enterOperand2();
        }
        result = Double.parseDouble(strResult);
        if (result == 0 && Calculator.sign.equals("/")) {
            System.out.println("Деление на ноль! Выберите, пожалуйста, другую операцию!");
            enterOperand2();
        }
        scanner.close();
        Calculator.operand2 = result;
    }

    private boolean checkInput(String strResult) {
        Boolean result = false;
        if (isDigit(strResult)) {
            result = true;
        } else {
            System.out.println("Введенное выражение не является числом. Попробуйте еще раз: ");
        }
        return result;
    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void arithmeticOperation(String sign) {

        switch (sign) {
            case "+": add(Calculator.operand1, Calculator.operand2);
            break;

            case "-": subtract(Calculator.operand1, Calculator.operand2);
            break;

            case "/": div(Calculator.operand1,Calculator.operand2);
            break;

            case "*": multip(Calculator.operand1,Calculator.operand2);
            break;
        }
        //scanner.close();
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.enterOperand1();
        calc.enterSymbolOperation();
        calc.enterOperand2();
        calc.arithmeticOperation(Calculator.sign);
        System.out.println(calc.getResult());
    }
}