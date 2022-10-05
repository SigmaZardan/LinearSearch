public class FindMaximumAndMinimumNumber {

    public static void main(String[] args){


        int[] arr = { 12,324,2,43,5,4,6456,456,};
        int answer = findMinimum(arr);
        System.out.println(answer);

        int answer2 = findMax(arr);
        System.out.println(answer2);


    }
    static int findMinimum(int[] arr){

        if(arr.length== 0 ){

            return Integer.MAX_VALUE;
        }
        int min  = arr[0];
        for(int index = 1; index < arr.length; index++){
            if(arr[index] < min){
               min = arr[index];
            }



        }
       return min;
    }

    static int findMax(int[] arr){

        if(arr.length== 0 ){

            return Integer.MIN_VALUE;
        }
        int max  = arr[0];
        for(int index = 1; index < arr.length; index++){
            if(arr[index] > max){
                max = arr[index];
            }



        }
        return max;
    }
}
