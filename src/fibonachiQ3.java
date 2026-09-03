import java.util.Scanner;

public class fibonachiQ3 {
    static void main(String[] args) {
        // question is find the nth fibonachi number
        int a = 0;
        int b = 1;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 2 ;

        while(count <= n ){
            int temp = b ;
            b = b + a;
            a = temp;
            count++;


        }
        System.out.println(b);
    }
}
