import java.util.Scanner;

public class non_rec_quicksort {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements in the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] =sc.nextInt();
            
        }
        quicksort(arr, 0, arr.length);



    }

    static void quicksort(int[] arr, int low, int high)
    {
        if(low < high)
        {
            q = partition(arr, low, high);
            quicksort(arr, low, q -1);
            low = q + 1;

            
        }
    }

    static int partition(int[] arr,int  p,int r)
    {
        int pivot = arr[r];
        int i = p - 1;

        for(int j = p; j <= r-1; j++)
        {
            if(arr[j] <= pivot)
            {
                i = i + 1;
                
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[r];
        arr[r] = temp;

        return (i+1);

    }
    
    void printArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");            
        }
    }
    
    
}
