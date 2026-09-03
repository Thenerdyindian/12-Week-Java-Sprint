public class ArrayQ2max {
    static void main(String[] args) {
        int[] arr = {1,3,23,45,83};
        System.out.println(maxRange(arr,0,3));
    }
    static int maxRange(int[] arr, int start , int end){
        int maxval = arr[start];
        for (int i = 0; i <= end ; i++) {
            if (arr[i]>maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }
//    static int max(int[] arr){
//        int maxval = arr[0];
//        for (int i = 0; i < arr.length ; i++) {
//            if (arr[i]>maxval){
//                maxval = arr[i];
//            }
//        }
//        return maxval;
//    }
}

