import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BubbleSortTest {

    @Test
    void sort_sortsArrayInAscendingOrder() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = {5, 3, 8, 4, 2};
        bubbleSort.sort(arr);
        assertArrayEquals(new int[]{2, 3, 4, 5, 8}, arr);
    }

    @Test
    void sort_sortsEmptyArray() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = {};
        bubbleSort.sort(arr);
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    void sort_sortsSingleElementArray() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = {1};
        bubbleSort.sort(arr);
        assertArrayEquals(new int[]{1}, arr);
    }

    @Test
    void sort_sortsAlreadySortedArray() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = {1, 2, 3, 4, 5};
        bubbleSort.sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void sort_sortsArrayWithDuplicates() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = {4, 2, 2, 3, 1};
        bubbleSort.sort(arr);
        assertArrayEquals(new int[]{1, 2, 2, 3, 4}, arr);
    }
}