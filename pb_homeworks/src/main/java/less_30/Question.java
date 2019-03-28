package less_30;

public class Question {
    // ["a", "b", "c"] -> "abc"
    // NULL -> NullPointExeption is Trown
    // [] -> "" ""

    public static String concat(String ... strs) {
        StringBuilder builder = new StringBuilder();
        try {
            for (int i = 0; i < strs.length; i++) {
                builder.append(strs[i]);
            }
        }
        catch (NullPointerException e) {
            e.printStackTrace(System.out);
        }
        finally {
            return builder.toString();
        }
    }
/*
    public static String concat2(String ... strs) {
        return new String(strs);
    }
*/
    public static void main(String[] args) {
        String[] arr1 = {"a", "b", "c"};
        String[] arr2 = {};
        String[] arr3 = null;
        System.out.println("Sample 1: " + concat(arr1));
        System.out.println("Sample 2: " + concat(arr2));
        System.out.print("Sample 3: ");
        System.out.println(concat(arr3));
    }
}
