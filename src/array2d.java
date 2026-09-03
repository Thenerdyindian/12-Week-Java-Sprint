import java.util.Arrays;
import java.util.Scanner;

public class array2d {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //syntax
        //int [][] arr = new int[3][3];
        /*
        1 2 3
        1 2 3
        1 2 3
         */
    //or
//        int[][] arr = {
//                {1,2,3},
//                {1,2,3},
//                {1,2,3}
//        };//can imagine this as an array of arrays .....thats how it is stored in the heap memory
//        int[][] arr = {
//                {1,2,3},
//                {1,2},
//                {1,2,3,4}
//                };//column doesnt matter
//        int[][] arr = {
//                {1,2,3},//0th index
//                {1,2},//1st index
//                {1,2,3,4}//2nd index --> arr[2] =
//        };
    int[][] arr = new int[3][3];
        System.out.println(arr.length);



        for (int row = 0; row < arr.length; row++) {
            //for each column in every row
            for (int col = 0; col<arr[row].length ; col++) {
                arr[row][col]= in.nextInt();
            }
        }

     //   for (int row = 0; row < arr.length; row++) {
            //for each column in every row
//            for (int col = 0; col<arr[row].length ; col++) {
//                System.out.print(arr[row][col]+ " ");
//            }
//            System.out.println();

     //   }
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//
//        }

        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
