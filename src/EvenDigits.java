//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class EvenDigits {

    public static void main(String[] args){

        int[] arr = { 1,12,13,243,2345};
        int answer  = findNumbers(arr);
        System.out.println(answer);

    }

    static int findNumbers(int[] arr){
        int count = 0;

        for(int number: arr){
            if(even(number)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){

        int numberOfDigits = digits(num);

        if(numberOfDigits % 2 == 0){
            return true;
        }
        return false;
    }
    static int digits(int number){
        if(number < 0){
            number = number * -1;
        }

        if(number == 0){
            return 1;
        }

        int count = 0;
        while(number> 0){

            number = number / 10;
            count++;
        }

        return count;
    }


}
