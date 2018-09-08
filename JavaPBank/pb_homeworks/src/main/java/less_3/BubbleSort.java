package less_3;

/**
 * Class less_3.BubbleSort.
 * Тестовое задание сортировка массива пузырьком.
 *
 * @autor alavrinenko.
 * @return array result.
 */
public class BubbleSort {
    /**
     * Method sort.
     * Сортируем массив по возрастанию.
     *
     * @param array исходный массив.
     * @return array отсортированый массив.
     */
    public int[] sort(int[] array) {
        // максимальный элемент - в конец фрагмента
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public void printArray(int[] array) {
        for (int arr: array){
            System.out.print(arr + " ");
        }
    }

    public static void main(String[] args) {
        int[] iArray = {95,17,5,26,84,2,62,15,7,4};
        BubbleSort bs = new BubbleSort();
        bs.printArray(bs.sort(iArray));
    }
}