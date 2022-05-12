import java.util.*;
public class rotate_array_by_d {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        int arr[] = new int[size];
        
        rotate_array_by_d caller = new rotate_array_by_d();

        System.out.println("Enter the elements in the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        caller.display(arr, size);
        System.out.println();
        System.out.println("Enter the Position for rotation");
        int pos  = sc.nextInt();

        caller.rotate_d(arr,pos);
        
        caller.display(arr, size);
        
    }

    //Naive Approach
    public void rotate_d(int[] arr, int pos)
    {
        rotate_array_by_d caller = new rotate_array_by_d();
        for(int i = 0;i < pos; i++)
        {
            caller.rotate(arr , arr.length);
        }
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
