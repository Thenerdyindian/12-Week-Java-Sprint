package KUNALS;

import java.util.Scanner;

public class NestedSwitch {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String Department = in.next();

        switch (empID) {
            case 1 -> System.out.println("Mohd Talha ");
            case 2 -> System.out.println("Nitin Balaji");
            case 3 -> {
                System.out.println("Emp Number 3 ");
                switch (Department) {
                    case "IT" -> System.out.println("IT Department ");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Enter Correct EMPID");
        }
    }
}
