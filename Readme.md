# Java Stream API Examples

This repository provides a collection of examples demonstrating various features of the Java Stream API. The Java Stream API is a powerful tool for processing collections of data in a functional and declarative style.

## Introduction to the Java Stream API

The Java Stream API, introduced in Java 8, provides a way to process collections of objects in a sequence or in parallel. Streams are sequences of elements that support various aggregate operations. They are designed to make collection processing more efficient and easier to read.

Key features of the Stream API include:

*   **Functional Programming:** Streams encourage a functional programming style, using lambda expressions to perform operations on data.
*   **Pipelines:** Stream operations can be chained together to form a pipeline, where each operation transforms the stream in some way.
*   **Laziness:** Many stream operations are lazy, meaning they are only executed when the result is actually needed.
*   **Parallelism:** Streams can be processed in parallel, allowing for significant performance improvements when working with large datasets.

## Repository Contents

This repository contains the following Java files, each demonstrating a specific aspect of the Java Stream API:

*   **S1_EmptyStream.java:** Demonstrates how to create an empty stream.
*   **S2_StreamCreation.java:** Shows various ways to create streams from different sources, such as collections, arrays, and individual values.
*   **S3_StreamCollection.java:** Explores how to collect stream elements into different data structures, such as lists, sets, and maps.
*   **S4_StreamReducer.java:** Illustrates how to use the `reduce` operation to combine stream elements into a single result.
*   **S5_IntermediateOps.java:** Demonstrates various intermediate operations, such as `filter`, `map`, `sorted`, and `distinct`.
*   **S6_TerminationOps.java:** Shows different terminal operations, such as `forEach`, `toArray`, `findFirst`, and `anyMatch`.
*   **S7_ParallelStream.java:** Demonstrates how to create and use parallel streams for improved performance.
*   **S8_FlatMap.java:** Explains how to use the `flatMap` operation to flatten a stream of collections into a single stream.
*   **S9_NestedMapping.java:** Demonstrates how to work with nested data structures using streams and mapping.

## Getting Started

To run the examples in this repository, you will need:

*   Java Development Kit (JDK) 8 or later
*   A suitable IDE or text editor

1.  Clone the repository to your local machine:

    ```bash
    git clone https://github.com/sayancoding/Java-Stream-API.git
    ```

2.  Open the project in your IDE or text editor.

3.  Compile and run the Java files. For example, to run `S1_EmptyStream.java`, you can use the following command:

    ```bash
    javac S1_EmptyStream.java
    java S1_EmptyStream
    ```

## Contributing

Contributions to this repository are welcome! If you have any suggestions or improvements, feel free to submit a pull request.
