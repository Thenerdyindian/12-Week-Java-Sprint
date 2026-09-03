package KUNALS;

public class LeetQ2RichestPerson {
    static void main(String[] args) {


    }
    public int maximumWealth(int[][] richPersons){
//person =roll
        //account = col
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < richPersons.length; person++) {
            //when you start a new column take a new sum for that row
            int sum= 0 ;
            for (int account = 0; account < richPersons[person].length ; account++) {
                sum += richPersons[person][account];
            }
            if (sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
}
