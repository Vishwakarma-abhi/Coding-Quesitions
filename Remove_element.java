public class Remove_element 
{
    public static void main(String[] args) 
    {
        
        int nums[] ={3,2,2,3};
        int val = 3;
        int len = nums.length -1;


        System.out.println("Original array \n");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+"  ");
        }
        System.out.println("");


        int j = 0;
        if(nums.length == 0)
            System.out.println("Array is empty");
        for(int i = 0 ;i < nums.length;i++)
        {
            if(nums[i] != val)
            {
                nums[j] =nums[i];
                j++;
            }
            
        }
        for (int i = 0; i < nums.length; i++) 
        {
            System.out.print(nums[i]+ "  ");
        }
    }
}
