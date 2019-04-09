package less_8.lection.s05trywithresources;

import java.io.FileReader;
import java.io.IOException;

public class TwrTwo {
    // с try-with-resources
    public static void main(String[] args) {

        try (FileReader fr = new FileReader("/test/file.txt")) {
            char[] array = new char[10];
            // чтение содержимого массива
            fr.read(array);

            for (char c:array) {
                // вывод символов на экран - один за одним
                System.out.println(c);
            }
        } catch (IOException e) {
            System.out.println("Обработка исключений с try-with-resources");
            e.printStackTrace();
        }
    }
}
