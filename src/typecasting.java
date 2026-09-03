import java.util.Scanner;

public class typecasting {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       // float num = input.nextFloat();
        // type is converted automatically if thedestination is larger than the start
        // forcefullly converting it is know ass expliocit type casting
        int num = (int)(677.54f);
        System.out.println(num);


    }
}
