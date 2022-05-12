import java.util.Scanner;

public class mege2arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {5,7,8,9,10};
        int[] arr3=new int[arr1.length + arr2.length];

        mege2arr caller = new mege2arr();

        caller.merge(arr1, arr2 , arr1.length, arr2.length, arr3);
        for(int i = 0 ; i < arr3.length ; i++ )
        {
            System.out.print(arr3[i]+" ");
        }

    }

    private static  void merge(int[] arr1, int[] arr2, int len1 ,int len2,int[] arr3)
    {

        int i = 0, j = 0 , k = 0 ;

        while( i < len1 && j < len2)
        {
            
            if(arr1[i] <= arr2[j])
            {
                arr3[k] = arr1[i];
                i++;
            }
            else{
                arr3[k] = arr2[j];
                j++;
            }
            
            k++;
        }

        while(i < len1)
        {
            arr3[k] = arr1[i];
            i++;
            k++;
        }

        
        while(j < len2)
        {
            arr3[k] = arr2[j];
            j++;
            k++;
        }
    }
    
}
