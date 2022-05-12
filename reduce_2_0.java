import java.util.Scanner;
import java.util.*;
public class reduce_2_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 14;
        reduce_2_0 caller = new reduce_2_0();
        int res = caller.numberOfSteps(num);
        System.out.println("Number of Steps for reducing to zero  = "+res);
    
    }

    public int numberOfSteps(int num) {
        int count = 0;
        
        while(num != 0)
        {
            if(num % 2 == 0)
            {
                count++;
            }
            else
            {
                num -= 1;
            }
        }
        
        
       
        return count;
        
    }
    
}
