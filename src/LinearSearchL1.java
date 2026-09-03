public class LinearSearchL1 {
    static void main(String[] args) {
        int[] num= {1,34,324,54,2,34,432};
        int target = 432;
        int ans= linearsearch(num,target);
        System.out.println(ans);
    }
    //search in the array : return the index if item found
    //other wise if item not found reurn -1
    static int linearsearch(int[] arr, int target){
        if (arr.length==0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(element == target ){
                return index;
            }

        }
        //this line will execute if none of the reurn statements above executed
        //hence the target no found

        return -1;
    }
}
