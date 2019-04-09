package less_8.lection.s02trycatch;

public class TryCatchTest {
    public static void main(String[] args) {
        try {
            int array[] = {1, 2, 3};
            System.out.println(array[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Исключение " + e);
            //e.printStackTrace();
            //System.out.println(e.getMessage());
        }
        System.out.println("Вне блока");
    }
}
