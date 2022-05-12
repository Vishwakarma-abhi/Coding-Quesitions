import java.util.Random;
import java.util.Scanner;

public class leftrotate_1  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size  = sc.nextInt();
        int arr[] =new int[size];

        
        System.out.println("Enter the Elements in the array");
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }

        leftrotate_1 caller = new leftrotate_1();

        caller.rotate(arr, size);

        System.out.println("\nArray rotated by one(first) index anticlockwise ");
        caller.display(arr,size);

    }

    public void rotate(int[] arr, int size)
    {
        int temp = arr[0];

        for (int i = 0; i < arr.length -1; i++) {
            arr[i] = arr[i+1];

        }
        arr[size -1] = temp;

    }

    public void display(int arr[], int size )
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
    }
    
}
