import java.util.*;

public class digit_sum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num  =  38;
        int sum  = 0;

        while(num != 0)
        {
            int rem = num % 10;
            sum += rem;
            num = num / 10;
            if(num < 10)
            {
                break;
            }
            else{
                num =sum;
            }
        }
    }
    
}
