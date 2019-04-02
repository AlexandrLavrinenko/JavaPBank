package less_7.lecture.s08lambdas;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        // Anonymous Inner Classes - вариант до лямбда-выражений
        System.out.println("Anonymous Inner Classes");
        doOperation(new Operations() {
            @Override
            public double execute(double a, double b) {
                return a + b;
            }
        });
        System.out.println();

        // Lambda
        System.out.println("Lambda");
        doOperation((double a, double b) -> {return a * b;});
        System.out.println();

        // Lambda - exersise #2
        doRunnable(() -> System.out.println("running (with Lambda)"));
        System.out.println("---------------------------------------");

        // Lambda - exersise #3
        Person[] people = new Person[]{
                new Person("Jack", 24),
                new Person("Bob", 18),
                new Person("Anna", 23)
        };
        System.out.println(Arrays.toString(people));
        // Anonymous Inner Classes
        Arrays.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getAge() - p2.getAge();
            }
        });
        // Lambda
        Arrays.sort(people, (p1, p2) -> p1.getAge() - p2.getAge());
        System.out.println(Arrays.toString(people));
        System.out.println();

        // С помощью лямбда-выражения передавать ссылки на методы
        doPrint((s) -> System.out.println("Something: " + s));
        System.out.println();
        // var.2
        doPrint(Main::print);
    }

    public static void doOperation(Operations oper){
        System.out.println("Start doOperation");
        double result = oper.execute(10, 5);
        System.out.println("result = " + result);
        System.out.println("End doOperation");
    }

    public static void doRunnable(Runnable runnable) {
        System.out.println("Execute doRunnable");
        runnable.run();
        System.out.println("Exit doRunnable");
    }

    // С помощью лямбда-выражения передавать ссылки на методы
    public static void doPrint(Printable printable){
        System.out.println("start doPrintable");
        printable.print("Hi!");
        System.out.println("stop doPrintable");
    }

    public static void print(String s) {
        System.out.println("Printing: " + s);
    }
}
