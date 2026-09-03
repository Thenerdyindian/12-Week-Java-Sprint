package KUNALS;

import java.util.Scanner;

public class IFFORLOOPS {
    public static void main(String[] args) {
        //syntax of If statements
        //if ( boolean expression T or F ){
        //body
        /* } else {
        do this
        }

         */
//        int salary = 245000;
//            if ( salary> 10000) {
//                salary = salary + 2000;
//            }
//            else {
//                salary=  salary + 1000;
//            }
//        System.out.println(salary


        //LOOPS INTRO
        //for loop
        /* Syntax for LOOP

        for (intitalization ; condition ; increment/decrement){}


         */
//        for (int num = 1; num <= 5; num += 1) {
//            System.out.println(num);
//        }
        //int num=1 is going to be initialized
        //is num is less than or equal to 5
        // num = num +1
        // then run again
        // till the number is more than the condition which is 6
        // then the loop will be stopped
        // this is FOR LOOP .
        Scanner in = new Scanner(System.in) ;
            int n = in.nextInt();

        for(int num = 1;num <=n ; num++){
                System.out.print(num+" ");
            }



    }
}

















