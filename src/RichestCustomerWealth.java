//https://leetcode.com/problems/richest-customer-wealth/

public class RichestCustomerWealth {
    public static void main(String[] args){

    int[][] accounts= {{1,2,3},{3,4,5,6},{7,8,9,8}};
    int answer = maximumWealth(accounts);
    System.out.println(answer);

    }

    static int maximumWealth(int[][] arr){
        int maximum=0;


        for (int[] ints : arr) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            if (sum > maximum) {
                maximum = sum;

            }

        }
        return maximum;
    }
}
