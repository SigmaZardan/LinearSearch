public class SearchInRange {

    public static void main(String[] args){

        int[] arr = { 12,23,432,543,646,456,45,3,345,4543,43};
        int answer = linearSearchInRange(arr,2,8,12);
        System.out.println(answer);
    }
    static int linearSearchInRange( int[] arr, int startIndex, int endIndex, int target){

        if(arr.length == 0){
            return -1;
        }


        for(int index = startIndex; index < endIndex ; index++){
            if(arr[index] == target){
                return index;
            }
        }

        return -1;
    }

}
