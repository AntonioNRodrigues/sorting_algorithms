# Sorting Algorithms in Java

A small, self-contained Java project that implements several classic sorting algorithms. Each algorithm comes with its implementation and a short note on its time/space complexity. The project is built with Maven and tested with JUnit 5.

## Algorithms

| # | Algorithm | Method | Time (best / avg / worst) | Space |
|---|-----------|--------|---------------------------|-------|
| 1 | Bubble Sort | `sort(int[])` | O(n) / O(n²) / O(n²) | O(1) |
| 2 | Selection Sort | `sort(int[])` | O(n²) / O(n²) / O(n²) | O(1) |
| 3 | Insertion Sort | `sort(int[])` | O(n) / O(n²) / O(n²) | O(1) |
| 4 | Merge Sort | `sort(int[], int, int)` | O(n log n) / O(n log n) / O(n log n) | O(n) |
| 5 | Quick Sort | `sort(int[], int, int)` | O(n log n) / O(n log n) / O(n²) | O(log n) |
| 6 | Heap Sort | `sort(int[])` | O(n log n) / O(n log n) / O(n log n) | O(1) |
| 7 | Built-in Sort | `sortArray(int[])` / `sortList(List<Integer>)` | O(n) / O(n log n) / O(n log n) | O(n) |

> Merge Sort and Quick Sort require the full index range on the first call, e.g. `sort(arr, 0, arr.length - 1)`.

## Requirements

- Java 25 (see `maven.compiler.release` in `pom.xml`)
- Apache Maven 3.8+

## Getting Started

Clone the repository and build:

```bash
git clone https://github.com/AntonioNRodrigues/sorting_algorithms.git
cd sorting_algorithms
mvn compile
```

## Usage

Every sorter sorts an `int[]` in place (except `BuiltInSort`, which also handles `List<Integer>`).

```java
int[] data = {5, 2, 8, 3, 1};

new BubbleSort().sort(data);
// data -> [1, 2, 3, 5, 8]

int[] data2 = {5, 2, 8, 3, 1};
new MergeSort().sort(data2, 0, data2.length - 1);

// Java's built-in (TimSort) for arrays and lists
BuiltInSort builtIn = new BuiltInSort();
builtIn.sortArray(data);
builtIn.sortList(java.util.Arrays.asList(5, 2, 8, 3, 1));
```

Run the built-in demo directly:

```bash
mvn compile
java -cp target/classes BuiltInSort
```

## Running Tests

```bash
mvn test
```

The test suite covers each algorithm with `BubbleSortTest`, `SelectionSortTest`, `InsertionSortTest`, `MergeSortTest`, `QuickSortTest`, and `HeapSortTest`.

## Project Structure

```
sorting_algorithms/
├── pom.xml
├── src/
│   ├── main/java/        # Sorting implementations
│   └── test/java/        # JUnit 5 tests
└── README.md
```

## License

Released into the public domain under [The Unlicense](LICENSE).
