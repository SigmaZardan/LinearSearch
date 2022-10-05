//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigitsMoreFasterSolution {

    public static void main(String[] args){

        int[] arr = { 12,123,1234,13,123,123456,5436};
        int answer = findNumbers(arr);
        System.out.println(answer);

    }
    // this provides 1 ms solution

    static int findNumbers(int[] arr){

        if(arr.length == 0){
            return -1;
        }

        int count  = 0;
        for(int number : arr){
            if(even(number)){
                count++;
            }
        }
        return count;

    }
    static boolean even(int number){
        int noOfDigits = noOfDigits(number);
        return noOfDigits % 2 ==0;

    }

    static int noOfDigits(int num){
        if(num < 0 ){
            num = num * -1;
        }

        if(num == 0 ){
            return 1;
        }

        return (int)(Math.log10(num)) + 1;
    }
}
