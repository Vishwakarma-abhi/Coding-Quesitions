import java.util.Arrays;
import java.util.Scanner;

public class max_mino {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements in the array");
        for(int i = 0;i < size ;i++)
        {
            arr[i]=sc.nextInt();
        }

        
    }
    /*Complete the code*/
    static pair getMinMax(long a[], long n)  
    {
        long min=9999999,max=0;
        for(int i = 0; i < n; i++ )
        {
            if(arr[i] > max)
            {
                max=arr[i];
            }
            if(arr[i] < min)
            {
                min=arr[i];
            }
        }
        
        pair result = new pair(min,max);
        return result;
    }
    
}
