import java.util.*;

public class Squares_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {-4,9,2,6,15};
        Squares_sort caller = new Squares_sort();
        System.out.println("Original Array");
        caller.display(arr);
        caller.sortedSquares(arr);
        System.out.println("\nSoterd squared Array");
        caller.display(arr);
    }
    public void display(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }

    }


    public void sortedSquares(int[] nums) {
        
        for(int i = 0 ; i < nums.length ; i++)
        {
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        
    }
    
}
