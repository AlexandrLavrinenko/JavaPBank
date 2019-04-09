package less_8.lecture.s06customexception;

public class Account {
    private int number;
    private double balacne;

    public Account(int number) {
        this.number = number;
    }

    /**
     * Пополнение счета
     */
    public void deposit(double amount) {
        balacne += amount;
    }

    /**
     * Снятие со счета
     */
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= balacne) {
            balacne -= amount;
        } else {
            double needs = amount - balacne;
            throw new InsufficientFundsException(needs);
        }
    }
}
