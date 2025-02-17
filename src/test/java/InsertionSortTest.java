import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    @Test
    void sort_sortsArrayInAscendingOrder() {
        InsertionSort insertionSort = new InsertionSort();
        int[] arr = {5, 3, 8, 4, 2};
        insertionSort.sort(arr);
        assertArrayEquals(new int[]{2, 3, 4, 5, 8}, arr);
    }

    @Test
    void sort_sortsEmptyArray() {
        InsertionSort insertionSort = new InsertionSort();
        int[] arr = {};
        insertionSort.sort(arr);
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    void sort_sortsSingleElementArray() {
        InsertionSort insertionSort = new InsertionSort();
        int[] arr = {1};
        insertionSort.sort(arr);
        assertArrayEquals(new int[]{1}, arr);
    }

    @Test
    void sort_sortsAlreadySortedArray() {
        InsertionSort insertionSort = new InsertionSort();
        int[] arr = {1, 2, 3, 4, 5};
        insertionSort.sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void sort_sortsArrayWithDuplicates() {
        InsertionSort insertionSort = new InsertionSort();
        int[] arr = {4, 2, 2, 3, 1};
        insertionSort.sort(arr);
        assertArrayEquals(new int[]{1, 2, 2, 3, 4}, arr);
    }
}