package KUNALS;

import java.util.Arrays;

public class BuubleSort {
    static void main(String[] args) {
        int[] arr = { 1,2,3,4,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr ){
        boolean swapped;
        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //for each step , max item will come at last respective index
            for (int j = 0; j < arr.length; j++) {
                //swap if the item is smaller than the previos item
                if (arr[j]<arr[j]-1){
                    //swap
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }
}
