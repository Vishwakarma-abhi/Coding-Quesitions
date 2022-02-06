import java.util.HashMap;
import java.util.Scanner;

public class Twosum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] nums=new int[size];

        System.out.println("Enter element in the array");
        for(int i =0 ;i < size ; i++)
        {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter targeted sum value");
        int target = sc.nextInt();
        Twosum call = new Twosum();
        
        call.twosum(nums, size, target);     
    }

    private static void twosum(int nums[], int size ,int target)
    {
        HashMap<Integer,Integer> set = new HashMap<>();
        int b=0,i;
        for(i = 0; i < nums.length;i++)
        {
            b = target - nums[i];
            if(set.containsKey(b))
            {
                break;
                
            }
            else{
                set.put(nums[i], i);
            }
        }
        
        System.out.println("Required Indexes is "+i+" "+set.get(b));
        

    }
    
}
