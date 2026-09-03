package KUNALS;

public class reverseQ5 {
    static void main(String[] args) {
        int n = 123456;
        int rev = 0;

//        while(n>0){
//            int rem = n%10;
//            if (rem != 0 ){
//                rev = rev*10 + rem ;
//            }
//            n=n/10;
//        }this is my logical code
        while(n>0){
            int rem = n % 10;
                    n /= 10;

                    rev = rev*10 + rem ;
        }//this is kunals code and logic
        System.out.println("the reverse is "+ rev);

    }
}
