package less_8.lection.s04finally;

public class FinallyTest {
    public static void main(String[] args) {
        int array[] = new int[2];
        try {
            System.out.println("Доступ к третьему элементу: " + array[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Исключение (catch) " + e);
            e.printStackTrace();
        } finally {
            array[0] = 6;
            System.out.println("Значение первого элемента: " + array[0]);
            System.out.println("Оператор finally выполнен");
        }

    }
}
