package less_2;

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
    private static double operand1, operand2, result;
    private static String sign;

    /**
     * Method add.
     * Суммируем два значения.
     *
     * @param operand1 .
     * @param operand2 .
     */
    public static void add(double operand1, double operand2) {
        Calculator.result = operand1 + operand2;
    }

    /**
     * Method subtract.
     * Вычитаем из первого второе значение.
     *
     * @param operand1 .
     * @param operand2 .
     */
    public static void subtract(double operand1, double operand2) {
        Calculator.result = operand1 - operand2;
    }

    /**
     * Method div.
     * Делим первое значение на второе.
     *
     * @param operand1 .
     * @param operand2 .
     */
    public static void div(double operand1, double operand2) {
        Calculator.result = operand1 / operand2;
    }

    /**
     * Method multip.
     * Умножаем первое значение на второе.
     *
     * @param operand1 .
     * @param operand2 .
     */
    public static void multip(double operand1, double operand2) {
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

    /**
     * Method enterOperand1.
     * Вводим первое значение.
     */
    public void enterOperand1() {
        // Ввод информации с клавиатуры
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите operand1: ");
        //Проверка на корректность введенных данных
        String strResult = scanner.next();
        if (!checkInput(strResult)) {
            enterOperand1();
        } else {
            double res = Double.parseDouble(strResult);
            operand1 = res;
        }
    }

    /***
     * Method enterOperand1.
     * Вводим символ математической операции.
     */
    public void enterSymbolOperation() {
        // Ввод информации с клавиатуры - первый операнд
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите символ необходимой операции: [+, -, /, *] ");
        String sSign = scanner.next();

        //метод проверки на соответствие математическим символам
        if (!matchSign(sSign)) {
            System.out.println("Неверно введен символ. Пожалуйста, введите символ из перечисленных - [+, -, /, *]: ");
            enterSymbolOperation();
        } else {
            sign = sSign;
        }
    }

    /***
     * Method matchSign.
     * Проверяем символ мат.операции на корректность.
     * @param sign - символ мат.операции.
     * @return - сответствует или нет.
     */
    private Boolean matchSign(String sign) {
        Boolean bRes;
        if (sign.equals("+") || sign.equals("-") || sign.equals("/") || sign.equals("*")) {
            bRes = true;
        } else {
            bRes = false;
        }
        return bRes;
    }

    /**
     * Method enterOperand2.
     * Вводим второе значение.
     */
    public void enterOperand2() {
        // Ввод информации с клавиатуры - второй операнд
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите operand2: ");
        //Проверка на корректность введенных данных
        String strResult = scanner.next();
        if (!checkInput(strResult)) {
            enterOperand2();
        }
        double dblRes = Double.parseDouble(strResult);
        if (dblRes == 0 && Calculator.sign.equals("/")) {
            System.out.println("Деление на ноль! Выберите, пожалуйста, другой делитель.");
            enterOperand2();
        } else {
            Calculator.operand2 = dblRes;
            scanner.close();
        }
    }

    /***
     * Method checkInput.
     * Проверка ввода на принадлежность к числу (double).
     * @param strResult - введенные символы с клавиатуры.
     * @return
     */
    private boolean checkInput(String strResult) {
        Boolean blnResult;
        if (isDigit(strResult)) {
            blnResult = true;
        } else {
            blnResult = false;
            System.out.println("Введенное выражение не является числом. Попробуйте еще раз: ");
        }
        return blnResult;
    }

    private static boolean isDigit(String s) throws NumberFormatException {
        Boolean blnDigin;
        try {
            Double.parseDouble(s);
            blnDigin = true;
        } catch (NumberFormatException e) {
            blnDigin = false;
        }
        return blnDigin;
    }

    /***
     * Method arithmeticOperation.
     * Распределение введеного символа мат.операции по соотв. метдодам.
     * @param sign - символ мат.операции.
     */
    public void arithmeticOperation(String sign) {

        switch (sign) {
            case "+":
                add(Calculator.operand1, Calculator.operand2);
                break;

            case "-":
                subtract(Calculator.operand1, Calculator.operand2);
                break;

            case "/":
                div(Calculator.operand1, Calculator.operand2);
                break;

            case "*":
                multip(Calculator.operand1, Calculator.operand2);
                break;
        }
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