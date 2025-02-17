import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SelectionSortTest {

    @Test
    void sort_sortsArrayInAscendingOrder() {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = {5, 3, 8, 4, 2};
        selectionSort.sort(arr);
        assertArrayEquals(new int[]{2, 3, 4, 5, 8}, arr);
    }

    @Test
    void sort_sortsEmptyArray() {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = {};
        selectionSort.sort(arr);
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    void sort_sortsSingleElementArray() {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = {1};
        selectionSort.sort(arr);
        assertArrayEquals(new int[]{1}, arr);
    }

    @Test
    void sort_sortsAlreadySortedArray() {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = {1, 2, 3, 4, 5};
        selectionSort.sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void sort_sortsArrayWithDuplicates() {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = {4, 2, 2, 3, 1};
        selectionSort.sort(arr);
        assertArrayEquals(new int[]{1, 2, 2, 3, 4}, arr);
    }
}