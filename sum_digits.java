import java.util.Scanner;

class sum_digits
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        int result = sum(num);
        System.out.println("Result ( sum of the digits  =  "+result);
    }

    public static int sum(int n)
    {
        //Base case
        if(n < 10)
        {
            return n;
        }
        int dsum = 0;
        dsum = dsum + (n % 10) + sum(n / 10);
        if(dsum < 10)
        {
            sum(dsum);
        }
        
        return dsum;
    }
}