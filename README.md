# Sorting Algorithms in Java

A small, self-contained Java project that implements several classic sorting algorithms. Each algorithm comes with its implementation and a short note on its time/space complexity. The project is built with Maven and tested with JUnit 5.

## Algorithms

<table>
  <thead>
    <tr>
      <th>#</th>
      <th>Algorithm</th>
      <th>Method</th>
      <th colspan="3">Time Complexity</th>
      <th>Space</th>
    </tr>
    <tr>
      <th></th>
      <th></th>
      <th></th>
      <th>Best</th>
      <th>Average</th>
      <th>Worst</th>
      <th></th>
    </tr>
  </thead>
  <tbody>
    <tr><td>1</td><td>Bubble Sort</td><td><code>sort(int[])</code></td><td>O(n)</td><td>O(n²)</td><td>O(n²)</td><td>O(1)</td></tr>
    <tr><td>2</td><td>Selection Sort</td><td><code>sort(int[])</code></td><td>O(n²)</td><td>O(n²)</td><td>O(n²)</td><td>O(1)</td></tr>
    <tr><td>3</td><td>Insertion Sort</td><td><code>sort(int[])</code></td><td>O(n)</td><td>O(n²)</td><td>O(n²)</td><td>O(1)</td></tr>
    <tr><td>4</td><td>Merge Sort</td><td><code>sort(int[], int, int)</code></td><td>O(n log n)</td><td>O(n log n)</td><td>O(n log n)</td><td>O(n)</td></tr>
    <tr><td>5</td><td>Quick Sort</td><td><code>sort(int[], int, int)</code></td><td>O(n log n)</td><td>O(n log n)</td><td>O(n²)</td><td>O(log n)</td></tr>
    <tr><td>6</td><td>Heap Sort</td><td><code>sort(int[])</code></td><td>O(n log n)</td><td>O(n log n)</td><td>O(n log n)</td><td>O(1)</td></tr>
    <tr><td>7</td><td>Built-in Sort</td><td><code>sortArray(int[])</code> / <code>sortList(List&lt;Integer&gt;)</code></td><td>O(n)</td><td>O(n log n)</td><td>O(n log n)</td><td>O(n)</td></tr>
  </tbody>
</table>

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

Released under the [MIT License](LICENSE).
