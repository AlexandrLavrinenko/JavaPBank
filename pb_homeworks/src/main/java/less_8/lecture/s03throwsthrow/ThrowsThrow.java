package less_8.lection.s03throwsthrow;

import javax.naming.InsufficientResourcesException;
import java.rmi.RemoteException;

public class ThrowsThrow {
    public static void main(String[] args) {
        try {
            deposit(56);
        } catch (RemoteException e) {
            System.out.println("Блок обработки исключения");
            e.printStackTrace();
        }
    }

    public static void deposit(double ammount) throws RemoteException {
        // создаем исключение вручную
        throw new RemoteException();
    }

    public void withdraw (double ammount) throws RemoteException, InsufficientResourcesException {

    }
}
