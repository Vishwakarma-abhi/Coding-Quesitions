import java.util.Scanner;

public class selection_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter size of the array");
        int n=sc.nextInt();
        System.out.println("Enter the Elements in the array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        selection_sort obj=new selection_sort();
        obj.sort(arr,n);
    
    }

    public void sort(int[] arr,int n)
    {
        for(int i=0;i<n-1;i++)
        {
            int imin=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j] < arr[imin])
                {
                    imin=j;
                }
            }
            int temp=arr[i];
            arr[i] = arr[imin];
            arr[imin]=temp;
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
