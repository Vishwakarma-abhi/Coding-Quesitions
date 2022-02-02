import java.util.Scanner;

public class MoveZeros {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int nums[] = {0,1,0,3,12};
        System.out.println("Original array");
        for (int i = 0; i < nums.length; i++) {
            System.out.print("  "+ nums[i]);
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            
            if(nums[i] != 0)
            {
                nums[j] = nums[i];
                j++;
            }
        }

        for (int i = nums.length - 1 ; i >= j; i--) {
            nums[i] = 0;
            
        }
        System.out.println("\n Moved all Zeros to last");
        System.out.println("New Array");
        //{1 ,3, 12, 3 , 12}
        for (int i = 0; i < nums.length; i++) {
            System.out.print("  "+ nums[i]);
        }

    }
    
}
