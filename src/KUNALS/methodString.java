package KUNALS;

import java.util.Scanner;

public class methodString {
    static void main(String[] args) {
     //   String message = greet();
       // System.out.println(message);

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your NAme ");
        String name = in.next();
        String personalised = myGreet(name);
        System.out.println(personalised);

    }


    static String myGreet(String name) {
        String message = "Heelo " + name;
        return message;
    }

    static String greet(){
        String greeting = " How are You ";
        return greeting;
    }
}
