import java.util.Arrays;

public class SearchIn2dArrays {

    public static void main(String[] args){
        int[][] arr = { {1,2,3},{4,5,6},{7,8,9}};


        int[] answer = search(arr, 4);
        System.out.println(Arrays.toString(answer));

        int answer2 = max(arr);
        System.out.println(answer2);
    }

    static int[] search(int[][] arr , int target){

// either we can iterate using for loop or for each loop as follows


        for(int row= 0; row < arr.length; row++){

            for(int column = 0; column < arr[row].length;column++){

                if(arr[row][column] == target){
                     return new int[]{row,column};
                }
            }
        }

      return new int[]{-1,-1};
    }

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;

        for(int[] ints : arr){
            for(int element : ints){

                if (element > max) {

                    max = element;
                }
            }


        }

        return max;
    }
}
