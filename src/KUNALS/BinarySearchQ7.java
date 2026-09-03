package KUNALS;

public class BinarySearchQ7 {
    static void main(String[] args) {

    }
    static int search(int[] arr , int target){
        int peak = peakIndexMountainArray(arr);
        int firstTry = BinarySearch(arr,target,0,peak);
        if (firstTry != 1){
            return firstTry;
        }
         return BinarySearch(arr,target,peak+1,arr.length-1);
    }
    static int peakIndexMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start<end){
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[mid +1]) {
                end = mid;
            }else {
                start = mid+1;
            }
        }
        return start;
    }
    static int BinarySearch(int[] arr, int target,int start , int end) {
        start = 0;
        end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
//this problem is 1095 leetcode and has not been submitted tioll