import java.util.Scanner;

public class MethodsL1 {

    static void main(String[] args) {
        int ans =sum3(20, 30);
        System.out.println(ans);
    }
        /*
        SYNTAX of a METHOD :-

        access modifier return_type name() {
        //body
        return statement;
        }
         */

    //passs the value of numbers when you are calling the method in main()

    static int sum3(int a, int b){
        int sum = a + b ;
        return sum;
    }
        static void sum() {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter Number 1: ");
            int num1 = in.nextInt();
            System.out.println("enter number 2: ");
            int num2 = in.nextInt();
            int sum = num1 + num2;
            System.out.println("sum is "+ sum);
        }

    }

