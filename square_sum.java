import java.util.Scanner;

public class square_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        square_sum caller = new square_sum();
        if(caller.isHappy(num))
        {
            System.out.println("Happy Number");
        }
        else{
            System.out.println("Not a Happy Number ");
        }
    }   
    public boolean isHappy(int n) {
        
        int sum = 0;
        if(n == 1)
        {
            return true;
        }
        else{
            while(n < 2)
            {
                int rem = n % 10;
                sum += Math.pow(rem,2);
                n = n / 10;
                
            }
        
        }
            
        isHappy(sum);
        return false;
        
        
    }
}
