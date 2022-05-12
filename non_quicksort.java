import java.io.ObjectInputFilter.Status;
import java.util.Scanner;

public class non_quicksort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }


    
    void printArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");            
        }
    }

    static void quick_sort(int[] arr,int l,int h)
    {
        int[] stack = new int[h-l+1];
        int top = -1;
        stack[++top] =l;
        stack[++top] =h;

        while(top >= 0)
        {
            h = stack[top--];
            l = stack[top--];
            int p = partition(arr,l,h);
            if(p - 1 > l)
            {
                stack[++top] = l;
                stack[++top] = p-1;
            }
            if(p + 1 < h)
            {
                stack[++top] = p + 1

                stack[++top] =h;          
            }
        }
        

    }
    
}
