package less_30;

public class LambdaLessons {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("hello world");

        //Consumer<Integer> c = (int x) -> { System.out.println(x) };
    }
}
