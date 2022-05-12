import java.util.*;

public class non_rec_nCrr {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n");
        int n =sc.nextInt();

        System.out.println("Enter the value of r");
        int r =sc.nextInt();
        
        int result = calculate_nCr(n,r);
        System.out.println("Result of  =  "+ n +" C "+r+"  = "+ result);
    }

    static int calculate_nCr(int n, int r)
    {
        int nCr = fact(n)/(fact(r)* fact(n - r));

        return nCr;

    }

    static int fact(int n)
    {
        int fact = 1;
        for(int i = 1; i <= n ; i++)
        {
            fact = fact * i;
        }
        return fact;
    }
    
    
}
