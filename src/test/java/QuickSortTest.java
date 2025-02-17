import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    void sort_sortsArrayInAscendingOrder() {
        QuickSort quickSort = new QuickSort();
        int[] arr = {5, 3, 8, 4, 2};
        quickSort.sort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{2, 3, 4, 5, 8}, arr);
    }

    @Test
    void sort_sortsEmptyArray() {
        QuickSort quickSort = new QuickSort();
        int[] arr = {};
        quickSort.sort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    void sort_sortsSingleElementArray() {
        QuickSort quickSort = new QuickSort();
        int[] arr = {1};
        quickSort.sort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{1}, arr);
    }

    @Test
    void sort_sortsAlreadySortedArray() {
        QuickSort quickSort = new QuickSort();
        int[] arr = {1, 2, 3, 4, 5};
        quickSort.sort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void sort_sortsArrayWithDuplicates() {
        QuickSort quickSort = new QuickSort();
        int[] arr = {4, 2, 2, 3, 1};
        quickSort.sort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{1, 2, 2, 3, 4}, arr);
    }
}