
public class LinearSearch {
    public static void main(String[] args) {
        String name = "Akash";
        char target = 'm';
        System.out.println(search(name , target));

        
    }

    // for strings

    static boolean search(String str , char target){
        if(str.length() == 0){
            return false;
        }

        for(int i = 0; i<str.length(); i++ ){
            if(target == str.charAt(i)){
                return true;
            }

        }
        return false;
    }

    // for array 

    //static int linear(int[] arr, int target){
    //    if(arr.length == 0){
     //       return -1;
     //   }
       // for(int index = 0; index < arr.length; index++){
      //      int element = arr[index];
        //    if(element == target){
          //      return index;
            //}
        //}
     //   return -1;
        


}
