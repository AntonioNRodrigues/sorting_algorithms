# Sorting Algorithms in Java

This project contains implementations of several major sorting algorithms in Java. Each algorithm includes its implementation and a brief explanation of its time complexity using Big O notation.

## Sorting Algorithms

### 1. Bubble Sort
- **Description**: A simple comparison-based algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.
- **Time Complexity**: O(n^2)

### 2. Selection Sort
- **Description**: A comparison-based algorithm that sorts an array by repeatedly finding the minimum element from the unsorted part and putting it at the beginning.
- **Time Complexity**: O(n^2)

### 3. Insertion Sort
- **Description**: A comparison-based algorithm that builds the final sorted array one item at a time. It is much less efficient on large lists than more advanced algorithms.
- **Time Complexity**: O(n^2)

### 4. Merge Sort
- **Description**: A divide and conquer algorithm that divides the array into halves, sorts them, and then merges them back together.
- **Time Complexity**: O(n log n)

### 5. Quick Sort
- **Description**: A divide and conquer algorithm that works by selecting a 'pivot' element and partitioning the array around the pivot, putting elements less than the pivot on one side and greater elements on the other.
- **Time Complexity**: O(n log n) on average; O(n^2) in the worst case

### 6. Heap Sort
- **Description**: A comparison-based sorting technique based on the binary heap data structure. It is similar to selection sort where we first find the maximum element and place the maximum element at the end.
- **Time Complexity**: O(n log n)

### 7. Built-in Sort (Using Java's Native Sorting Algorithms)
- **Description**: Uses Java's built-in sorting algorithms provided by the `Collections` and `Arrays` classes. These classes use the highly efficient Tim Sort algorithm, which is a hybrid of merge sort and insertion sort.
- **Time Complexity**: O(n log n)

## How to Run
1. Compile the Java files.
2. Execute the main class to see the sorting algorithms in action.
