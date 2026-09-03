import java.util.Arrays;

public class LinearSearch2DArrayt {
    static void main(String[] args) {
        int[][] arr ={
                {23, 4,1 },
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };
        int target= 18;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));

        System.out.println(max(arr));
    }
    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length;col++) {
                if (arr[row][col] == target){
                    return new int[]{row,col};
                }

            }

        }
        return new int[]{-1,-1} ;
    }

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int[] ints = arr[i];
            for (int col = 0; col < ints.length; col++) {
                if (ints[col] > max) {
                    max = ints[col];
                }

            }

        }
        return max;
    }
}
