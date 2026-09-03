import java.util.Scanner;

public class q3 {
    static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();

            for (int i = 1; i <= n; i++) {
                for (int j = n - 1; j >= i; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}


