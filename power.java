import java.util.*;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number ");
        int num  = sc.nextInt();

        System.out.println("Enter the power");
        int p = sc.nextInt();
        // int result = 1;
        // for (int i = 0; i < p; i++) {
        //     result *= num;
        // }
        // System.out.println("Result is = "+result);
        power caller  =  new power();
        int rec_result = caller.x_n_power(num,p);
        System.out.println("Result using recursion "+rec_result);
    }
    

    int x_n_power(int num , int power)
    {
        if(power == 0)
            return 1;
        else if(power == 1)
        {
            return num;
        }
        else if(power > 1)
        {
            return num*x_n_power(num, power-1);
        }
        //Power is negative To be completed error
        else
        {
            return (1/(num*x_n_power(num, power-1)));
        }

    }
}
