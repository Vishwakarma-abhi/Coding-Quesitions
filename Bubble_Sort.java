/*Bubble Sort*/

public class Bubble_Sort {
    public static void main(String[] args) {
        int arr[]={1,8,4,6,5,7};
        Bubble_Sort obj=new Bubble_Sort();
        System.out.println("Array before sorting");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("  "+arr[i]);
        }
        System.out.println("\n Array After Sorting");
        int sorted_Array[]=obj.sort(arr,arr.length);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("  "+sorted_Array[i]);
        }

    }
    public static int[] sort(int[] arr,int n)
    {
        for(int i = 0;i < n-1;i++)
       {
           boolean swap = false;
           for(int j=0;j< n-1;j++)
           {
               if(arr[j] > arr[j+1])
               {
                   int temp=arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
               swap=true;
           }
           if(!swap)
           {
               break;
           }
       }
       return arr;
    }
}
