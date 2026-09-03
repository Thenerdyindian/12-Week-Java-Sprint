package KUNALS;

import java.util.Scanner;

public class switchL1 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Fruit");
        String fruit = in.next();

        switch (fruit) {
            case "Mango":
                System.out.println("King of Fruits ");
                break;
            case "Apple":
                System.out.println("a red fruit ");
                break;
            case "Banana":
                System.out.println("A yellow fruit ");
                break;
            default:
                System.out.println("PLease input a valid fruit");
                break;
        }

    }
}
