package KUNALS;

import java.util.Scanner;

public class casecheckQ2 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

        //qustion is whether you can check its uppercase or lowercase
        if (ch >= 'a' && ch <='z') {
            System.out.println("the char is lower case ");
        } else if (ch >='A' && ch <='Z') {
            System.out.println("the char is uppercase ");
        }
        else {
            System.out.println("error there is no character ");
        }



//        System.out.println(ch);

    }
}
