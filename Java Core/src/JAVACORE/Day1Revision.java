package JAVACORE;

/**
 * Day 1 revision examples: errors, integer division, and primitive types.
 */
public class Day1Revision {
    public static void main(String[] args) {
        // Integer division happens before the result is assigned to a double.
        double truncatedResult = 5 / 2;
        double decimalResult = 5 / 2.0;

        System.out.println("5 / 2 assigned to double: " + truncatedResult); // 2.0
        System.out.println("5 / 2.0: " + decimalResult);                    // 2.5

        // A logical error compiles and runs, but uses the wrong operation.
        int firstNumber = 8;
        int secondNumber = 5;
        int incorrectTotal = firstNumber - secondNumber;
        int correctTotal = firstNumber + secondNumber;

        System.out.println("Wrong total (subtraction): " + incorrectTotal);
        System.out.println("Correct total (addition): " + correctTotal);

        // Compile-time error example (kept as a comment so this file compiles):
        // int count = "five";

        // Runtime error example (kept as a comment so this file runs safely):
        // int impossible = 10 / 0;
    }
}
