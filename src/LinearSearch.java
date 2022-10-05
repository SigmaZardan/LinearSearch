public class LinearSearch {

    public static void main(String[] args){

        // linear search
        int[] arr = {23,2,423,234,564,65,7,91,83,84,854,92,57,87983};

        int result = linearSearch(arr, 84);
        System.out.println(result);


    }

    static int linearSearch(int[] arr, int target){
        if (arr.length == 0) {
            return -1;
        }

        for(int i = 0 ; i < arr.length ; i++){

            if(target == arr[i]){
                return i;
            }
        }

        return -1;
    }


    // this will return the element if it is found in the array.
    static int linearSearch2(int[] arr, int target){

        if(arr.length == 0){
            return Integer.MIN_VALUE; //  not returning -1 because minus 1 might be a element is the array
        }

      for( int element: arr){

          if(element == target){
              return element;
          }
      }
   return Integer.MIN_VALUE;
    }
    static boolean linearSearch3(int[] arr, int target){

        if(arr.length == 0){
            return false;
        }

        for( int element: arr){

            if(element == target){
                return true;
            }
        }
        return false;
    }
}
