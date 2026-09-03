package KUNALS;

public class BinarySearchL2 {
    static void main(String[] args) {
        //when we don't know if the sorted array is ascending or descending
        int[] arr = {-18,-12,-4,0,2,3,4,16,18,22,45};
        int target =0;
        int ans = BinarySearch(arr, target);
        System.out.println(ans);
    }

    //return the index
    static int BinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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