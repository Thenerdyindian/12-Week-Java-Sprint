public class BinarysearchQ3 {
    static void main(String[] args) {
     //   int[] arr = {-18, -12, -4, 0, 2, 3, 4, 16, 18, 22, 45};
        char[] arr = {'c','f','j'};
        char target = 'z';
        var ans = SmallestLetter(arr, target);
        System.out.println(ans);
    }

    //return the index
    static char SmallestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
           int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length];

    }
}
