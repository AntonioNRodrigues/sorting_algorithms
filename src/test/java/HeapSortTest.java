import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class HeapSortTest {

    @Test
    void sort_sortsArrayInAscendingOrder() {
        HeapSort heapSort = new HeapSort();
        int[] arr = {5, 3, 8, 4, 2};
        heapSort.sort(arr);
        assertArrayEquals(new int[]{2, 3, 4, 5, 8}, arr);
    }

    @Test
    void sort_sortsEmptyArray() {
        HeapSort heapSort = new HeapSort();
        int[] arr = {};
        heapSort.sort(arr);
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    void sort_sortsSingleElementArray() {
        HeapSort heapSort = new HeapSort();
        int[] arr = {1};
        heapSort.sort(arr);
        assertArrayEquals(new int[]{1}, arr);
    }

    @Test
    void sort_sortsAlreadySortedArray() {
        HeapSort heapSort = new HeapSort();
        int[] arr = {1, 2, 3, 4, 5};
        heapSort.sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void sort_sortsArrayWithDuplicates() {
        HeapSort heapSort = new HeapSort();
        int[] arr = {4, 2, 2, 3, 1};
        heapSort.sort(arr);
        assertArrayEquals(new int[]{1, 2, 2, 3, 4}, arr);
    }
}