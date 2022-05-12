import java.util.Scanner;

public class rec_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {

            arr[i] =sc.nextInt();
            
        }
        // display(arr, 0);


    }

    // static void display(int[] arr, int i)
    // {
    //     if(i < arr.length)
    //     {


    //     }
    //     System.out.println(arr[i]);
    //     display(arr , i++);
    // }
    
}
