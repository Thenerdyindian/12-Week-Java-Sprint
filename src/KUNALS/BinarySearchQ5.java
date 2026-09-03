package KUNALS;

public class BinarySearchQ5 {
    //infite size of array question
    static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println(sizeofarray(arr , target));
    }
    static int sizeofarray(int[] arr , int target ){
        //first start with a box of size 2
        int start = 0;
        int end = 1;
        //condition for the target to lie in the range
        while(target>arr[end]){
            int Newstart = end+1;
            end = end + (end-start + 1)*2 ;
            start = Newstart;
        }
        return InfiniteArray1(arr , target ,start,end);
    }
    static int InfiniteArray1(int[] arr , int target , int start , int end){
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
