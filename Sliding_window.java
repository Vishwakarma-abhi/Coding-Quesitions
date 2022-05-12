public class Sliding_window {
    public static void main(String[] args) {
       
        int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20};
        Sliding_window caller =new Sliding_window();
        int k = 4;
        double result = caller.findmax(arr,k);
        System.out.println("Result is  = "+result);
    }
    public double findmax(int[] nums, int k) {
        double max_sum = 0.0,max = 0.0;
    
        for(int i = 0; i < k; i++)
        {
            max_sum += nums[i]; 
            
        }
        
        double window_sum = max_sum;
        for(int j = k ; j < nums.length ; j++)
        {
            window_sum += nums[j] - nums[j-k];
            max = Math.max(max_sum,window_sum);
        }
        return max;
        
        
    }
}
