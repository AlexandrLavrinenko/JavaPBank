package less_8.lecture.s06customexception;

/**
 * Исключение, описывающее недостаток средств на банковском счету
 * Checked-исключение, обязательное к обработке
 */
public class InsufficientFundsException extends Exception {

    private double amount;

    public InsufficientFundsException(double amount) {
        this.amount = amount;
    }

    public double getAmount(){
        return amount;
    }
}
