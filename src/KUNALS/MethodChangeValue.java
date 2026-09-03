package KUNALS;

import java.util.Arrays;

public class MethodChangeValue {
    static void main(String[] args) {
        //create an array
        int[] arr = { 4,5,3,34};
        change(arr);
        System.out.println(Arrays.toString(arr));


     }
     static void  change(int[] nums){
        nums[0] = 99;
     }
     //the original array will change because we are modifying the array ( strings cannot be modified )
    //if you make a change to the object via this reference variable ,same object will be changed
}
