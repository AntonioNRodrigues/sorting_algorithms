import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @Test
    void sort_sortsArrayInAscendingOrder() {
        MergeSort mergeSort = new MergeSort();
        int[] arr = {5, 3, 8, 4, 2};
        mergeSort.sort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{2, 3, 4, 5, 8}, arr);
    }

    @Test
    void sort_sortsEmptyArray() {
        MergeSort mergeSort = new MergeSort();
        int[] arr = {};
        mergeSort.sort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    void sort_sortsSingleElementArray() {
        MergeSort mergeSort = new MergeSort();
        int[] arr = {1};
        mergeSort.sort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{1}, arr);
    }

    @Test
    void sort_sortsAlreadySortedArray() {
        MergeSort mergeSort = new MergeSort();
        int[] arr = {1, 2, 3, 4, 5};
        mergeSort.sort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void sort_sortsArrayWithDuplicates() {
        MergeSort mergeSort = new MergeSort();
        int[] arr = {4, 2, 2, 3, 1};
        mergeSort.sort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{1, 2, 2, 3, 4}, arr);
    }
}