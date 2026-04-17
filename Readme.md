# Java Stream API Examples

## Overview

This repository showcases the use of Java Stream API with practical examples. Java Stream API, introduced in Java 8, provides a functional approach to process collections of objects. It allows developers to perform complex data manipulations in a concise and readable manner.

## Structure

The repository is structured as follows:

-   **S1\_EmptyStream.java:** Demonstrates the creation of an empty stream.
-   **S2\_StreamCreation.java:** Illustrates various methods to create streams from different sources such as collections, arrays, and individual elements.
-   **S3\_StreamCollection.java:** Shows how to collect elements from a stream into different data structures like lists, sets, and maps.
-   **S4\_StreamReducer.java:** Explains the usage of the `reduce` operation to combine stream elements into a single summarized result.
-   **S5\_IntermediateOps.java:** Covers intermediate stream operations like `filter`, `map`, `sorted`, and `distinct` to transform and filter stream elements.
-   **S6\_TerminationOps.java:** Demonstrates terminal operations such as `forEach`, `toArray`, `findFirst`, and `anyMatch` that produce a result or side-effect.
-   **S7\_ParallelStream.java:** Shows how to leverage parallel streams to improve performance on multi-core processors.
-   **S8\_FlatMap.java:** Explains how to use `flatMap` operation to flatten a stream of collections into a single stream.
-   **S9\_NestedMapping.java:** Demonstrates the use of streams with nested data structures and mapping operations.
-   **model/:** Contains the optional model used to test stream operations

## Getting Started

### Prerequisites

-   Java Development Kit (JDK) 8 or higher

### Running the Examples

1.  Clone the repository:

    ```bash
    git clone https://github.com/sayancoding/Java-Stream-API.git
    ```

2.  Navigate to the cloned directory.

3.  Compile the Java files:

    ```bash
    javac *.java model/*.java
    ```

4.  Run the desired example:

    ```bash
    java S1_EmptyStream
    ```

## Contributing

Contributions are welcome. Please submit a pull request with your changes.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
