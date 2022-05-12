import java.util.Scanner;

public class rotate_array {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int arr[] = {1,2,5,4,8,7};
        int len = arr.length;

        System.out.println("Enter the position for rotation");
        int k = sc.nextInt();


        for (int i = 0; i < k; i++) {
            int temp = arr[i];
            arr[i] = arr[k-i];
            arr[k-i] = arr[i];  
        }
        for (int i = k; i < len; i++) {
            int temp = arr[i];
            arr[i] = arr[k-i];
            arr[k-i] = arr[i];  
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }


         sc.close();
     }
    
}
