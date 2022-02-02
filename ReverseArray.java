import java.util.Scanner;

class ReverseArray
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter "+size+" Elements in the array");
        
        int arr2[]=new int[size];
        
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        
        }
        ReverseArray obj=new ReverseArray();
        
        obj.reverse(arr,0,size-1);
     
        System.out.println("Reversed Array is");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    void reverse(int[] arr,int start,int end)
    {
        if(start >=end)return;
        int temp= arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

        reverse(arr,start+1,end-1);
    }
}