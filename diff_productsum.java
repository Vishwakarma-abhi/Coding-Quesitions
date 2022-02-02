import java.util.*;
public class diff_productsum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        diff_productsum caller =new diff_productsum();
        int differnce = caller.subtractProductAndSum(num);
        System.out.println("Difference of the product of digits and sum of the digits    = "+differnce);

    }
    public int subtractProductAndSum(int n) {
        int diff = 0, product = 1, sum = 0; 
        while(n != 0)
        {
            sum += n % 10;
            product *= n % 10;
            n = n / 10;
        }
        diff = product - sum;
        return diff;
    }
}
