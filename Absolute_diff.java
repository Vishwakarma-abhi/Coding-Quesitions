import java.util.Scanner;

class Absolute_diff
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Absolute_diff array = new Absolute_diff();

        System.out.println("Enter the size of the array");
        int size =sc.nextInt();
        int arr[] =new int[size];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] =sc.nextInt();
        }

        System.out.println("Enter Value of K");
        int k = sc.nextInt();

        int res = array.countKDifference(arr, k);
        System.out.println("Total number of Pairs equal to "+ k + "  is  = "+ res);

    }

    //naive approach O(n2) O(1)
    public int countKDifference(int[] nums, int k) {
        int diff = 0;
        int len = nums.length;
        for(int i = 0 ; i < len;i++)
        {
            for(int j = i+1 ; j < len;j++)
            {
                if(Math.abs(nums[i] - nums[j]) == k)
                {
                    diff++;
                }
                

            }
            
        }
        return diff;
        
    }
}