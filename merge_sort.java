import java.util.Scanner;

public class merge_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size = sc.nextInt();
        int arr[]= new int[size];
        
        System.out.println("Enter the elements in the array");
        for(int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("before array");
        for(int i = 0; i < size; i++)
        {
            System.out.print(arr[i]+" ");
        }

        mergesort(arr);
        System.out.println("\nAfter array");
        for(int i = 0; i < size; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void mergesort(int[] arr)
    {
        int size = arr.length;
        if(size < 2)return;

        int midindex = size / 2;
        int[] lefthalf = new int[midindex];
        int[] righthalf = new int[size - midindex];


        for(int i = 0; i < midindex; i++)
        {
            lefthalf[i] = arr[i];
        }

        for(int i = midindex; i < size; i++)
        {
            righthalf[i-midindex] = arr[i];
        }

        mergesort(lefthalf);
        mergesort(righthalf);

       

        //Merge
        merge(arr, lefthalf, righthalf);
    }
    public static void merge(int[] arr, int[] lefthalf,int[] righthalf)
    {
        int leftsize = lefthalf.length;
        int rightsize = righthalf.length;

        int i = 0 , j = 0 ,k = 0;

        while(i < leftsize && j < rightsize)
        {
            if(lefthalf[i] <= righthalf[j])
            {
                arr[k] = lefthalf[i];
                i++;
            }
            else{
                
                arr[k] = righthalf[j];
                j++;
            }
            k++;
        }

        while (i < leftsize)
        {
            arr[k] = lefthalf[i];
            i++;
            k++;
        }
        while (j < rightsize)
        {
            arr[k] = righthalf[j];
            j++;
            k++;
        }
        

    }

    
}
