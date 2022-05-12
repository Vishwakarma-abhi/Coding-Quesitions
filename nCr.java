import java.util.*;
public class nCr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("        Welcome         ");
        System.out.println("*************************");
        System.out.println("\nLets Calculate nCr ");
        System.out.println("Enter the value of n");
        int n = in.nextInt();
        System.out.println("Enter the value of r for the series");
        int r = in.nextInt();

        nCr caller = new nCr();
        int result = caller.calculate_nCr(n, r);

        System.out.println("Result of "+n+" C "+r+ " =  "+result);
        

    }

    public static int calculate_nCr(int n, int r)
    {
        if(r == 1)
        {
            return 1;
        }
        else if(n == r)
        {
            return 1;
        }
        else
        {
            return calculate_nCr(n-1,r) + calculate_nCr(n-1, r-1);
        }
    }
    
}
