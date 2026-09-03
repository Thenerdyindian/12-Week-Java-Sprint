import java.util.Scanner;

public class Q1 {
    static void main() {
        System.out.println("Enter The Number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if ( num % 3 == 0 & num % 5 == 0 ) System.out.println("FizzBuzz");
        else if (num % 3 != 0) {
            if (num % 5 == 0 ) {
                System.out.println("Buzz");
            } else System.out.println("Number is not divisible by both ");
        } else System.out.println("Fizz");

    }
    }


/*Write a program that takes a number and prints "Fizz" if it
is divisible by 3, "Buzz" if divisible by 5, and "FizzBuzz" if it is divisible by both.
*/
