import java.util.Scanner;

public class occurrencesQ4 {
    static void main(String[] args) {
        //question is  how to find the number of occurences of a number ,
        long n = 4536345334333433L;
        long count = 0L;
        while(n>0) {
            long rem = n % 10;
            if (rem == 3) {
                count++;
                n = n / 10;

            }
            n = n / 10;
        }
        System.out.println("count is " + count);
        }



    }

