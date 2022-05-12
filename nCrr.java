import java.util.Scanner;

public class nCrr {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the value of n");
        int n =sc.nextInt();

        System.out.println("Enter the value of r");
        int r =sc.nextInt();
        
        int result = calculate_nCr(n,r);
        System.out.println("Result of  =  "+ n +" C "+r+"  = "+ result);


    }
    static int calculate_nCr(int n,int r)
    {
        if(r == 0)
        {
            return 1;
        }
        else if(n == r)
        {
            return 1;
        }
        else
        {
            return calculate_nCr(n-1, r) + calculate_nCr(n-1, r-1);
        }


    }
    
}
