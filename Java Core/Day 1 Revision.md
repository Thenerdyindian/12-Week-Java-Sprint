# Day 1 Revision: Java Foundations

## Error types

- **Compile-time error (CTE):** The compiler rejects the source, for example when a `String` is assigned to an `int`. That source is not turned into a new class file.
- **Runtime error (RTE):** The program compiles, then fails while running, for example with integer division by zero (`10 / 0`).
- **Logical error:** The program compiles and runs but gives an unwanted answer, often because the code uses the wrong operator or operand order.
- **No error:** The code compiles, runs, and produces the intended result.

## Compilation and old class files

If compilation fails, the failed source does not reach the JVM as a newly compiled program. An older `.class` file may still be present from a previous successful build. If someone explicitly runs that stale class file, it can execute old behavior; it does not contain the changes from the source that failed to compile. Rebuild successfully before running to ensure the class file matches the source.

## A useful first check for a wrong answer

When a program runs but its output is wrong, inspect the expression: check the operator first, then check which operands it acts on and their order. A program that subtracts where addition was intended is a logical error, not a compiler or runtime error.

## Integer division and `double`

The type of the expression is determined before assignment. If both operands are integers, Java performs integer division and discards the fractional part. Assigning that integer result to a `double` widens it afterward; it cannot restore the discarded fraction.

```java
double a = 26 / 2;   // integer division gives 13, then widens to 13.0
double b = 26 / 2.0; // double division gives 13.0
double c = 5 / 2;    // integer division gives 2, then widens to 2.0
double d = 5 / 2.0; // double division gives 2.5
```

Use a floating-point operand such as `2.0` when the calculation itself must retain a fractional part. The runnable examples are in [`src/JAVACORE/Day1Revision.java`](src/JAVACORE/Day1Revision.java).
