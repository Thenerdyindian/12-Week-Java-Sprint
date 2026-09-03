import java.util.Scanner;

public class MethodArmstrong {

   //find all the three digit armstrong number
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
        int a=0;
        boolean ans = isArmstrong(a);
//        System.out.println(ans);
        for (int i= 100; i <1000;i++){
            if (isArmstrong(i)){
                System.out.print(i + " ");
            }
        }

    }
    static boolean isArmstrong(int a){
        int original = a ;
        int sum = 0 ;

        while (a>0){
            int rem = a % 10 ;
            a = a/10;
            sum = sum + rem*rem*rem;

        }
        return sum == original;

    }
}
