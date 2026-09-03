package KUNALS;

import java.util.ArrayList;
import java.util.List;

public class CycleSortQ2 {
    static void main(String[] args) {
        //find the missing nums
        int[] arr = {1,3,4,2,2};
        System.out.println(CYCLESORT(arr));
    }

    static List<Integer> CYCLESORT (int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i]-1 ;
            if (arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1){
                ans.add(index+1);
            }
        }
        return ans;

    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
