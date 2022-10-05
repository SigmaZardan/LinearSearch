public class SearchInStrings {
    public static void main(String[] args){

      // Searching a character in a string
        String name = "Bibek";
        boolean ans = linearSearch(name,'g');
        System.out.println(ans);


    }
    static boolean linearSearch(String name , char target){
        if(name.length() == 0){
            return false;
        }

        for(int index = 0; index < name.length(); index++){
             char element = name.charAt(index);

             if(element == target){ // here it compares the ASCII values for both the elements

                 return true;
             }


        }
        return false;
    }

    static boolean linearSearch2(String name , char target){
        if(name.length() == 0){
            return false;
        }

       for( char ch : name.toCharArray()){
           if(ch ==target){
               return true;
           }


        }
        return false;
    }
}
