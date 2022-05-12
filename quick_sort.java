import java.util.Scanner;

class quick_sort
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        quick_sort caller  = new quick_sort();
        
        System.out.println("Enter the size of the array");
        int size =sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements in the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }

        caller.printArray(arr);

        caller.quicksort(arr, 0 , arr.length-1);


        System.out.println("\nArray after sorting");
        caller.printArray(arr);
    }

    private  void quicksort(int[] arr,int low, int high)
    {
        int  q;
        if( low < high)
        {
            q = partition(arr, low, high);
            quicksort(arr, low, q -1);
            quicksort(arr, q+1, high);
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