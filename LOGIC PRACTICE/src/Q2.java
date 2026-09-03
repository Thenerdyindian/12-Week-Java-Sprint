import java.util.Scanner;

public class Q2 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i <= n ; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();


        }

    }
}
