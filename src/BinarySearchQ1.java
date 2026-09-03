public class BinarySearchQ1 {
    static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 16, 18, 22, 45};
        int target = 0;
        int ans = BinarySearch(arr, target);
        System.out.println(ans);
    }

    //return the index
    static int BinarySearch(int[] arr, int target) {
        if (target>arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        int mid = 0;
        while (start <= end) {
            //find the middle element
            //int mid  ( start + end ) / 2
            //might be possible that the start plus end thing we are doing exceeds the range of int in java
            mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return arr[mid];
            }

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target <= arr[mid]) {
                return mid + 1;
            }
        }
        return arr[start];


    }

}
