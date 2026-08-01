import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i < 5; i++){
            System.out.println("Enter the vlues :");
            arr[i] = sc.nextInt();
           
           
        }
        for(int each : arr){
            System.out.print(each + " ");

        }
      
    }
   
}
