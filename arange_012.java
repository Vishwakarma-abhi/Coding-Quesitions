/*Dutch Flag Algorithm sort 0 1 2 */
import java.util.Scanner;

public class arange_012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 1, 0 , 2 , 1 , 0};
        System.out.println("Original Array");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+"  ");
        }
        
        arange_012 obj = new arange_012();
        obj.arange(arr , arr.length );

        System.out.println("\nSorted Array");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+"  ");
        }
    }

    public static void arange(int[]  arr, int n)
    {
        int z = 0, o = 0, t = 0;
        for(int i = 0 ; i < n ; i++ )
        {
            if(arr[i] == 0)z++;
            if(arr[i] == 1)o++;
            if(arr[i] == 2)t++;
            
        }

        int i = 0;

        while ( z > 0)
        {
            arr[i] = 0;
            z--;
            i++;
        }

        while ( o > 0)
        {
            arr[i] = 1;
            o--;
            i++;
        }
        while ( t > 0)
        {
            arr[i] = 2;
            t--;
            i++;
        }
    }
    
}
