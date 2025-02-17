import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BuiltInSort {

    public void sortArray(int[] arr) {
        Arrays.sort(arr);
    }

    public void sortList(List<Integer> list) {
        Collections.sort(list);
    }

    public static void main(String[] args) {
        BuiltInSort builtInSort = new BuiltInSort();

        int[] array = {5, 2, 8, 3, 1};
        builtInSort.sortArray(array);
        System.out.println("Sorted array: " + Arrays.toString(array));

        List<Integer> list = Arrays.asList(5, 2, 8, 3, 1);
        builtInSort.sortList(list);
        System.out.println("Sorted list: " + list);
    }
}
