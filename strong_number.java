import java.util.Scanner;

public class strong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number ");
        int num = sc.nextInt();

        if(num == isStrong(num))
        {
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not a Strong Number");
        }
        
    }

    public static int isStrong(int num)
    {
        int sum = 0;
        while (num != 0) {
            sum += factorial((num % 10));
            num /= 10;
        }
        return sum;

    }

    public static int factorial(int num)
    {
        if(num == 1)
        {
            return 1;
        }

        return num * factorial(num-1);
    }
    
}
