import java.util.Scanner;

public class XOR_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, start;
        System.out.println("Enter the size for the array");
        n = sc.nextInt();
        System.out.println("Enter the start value");
        start = sc.nextInt();

        XOR_array caller =  new XOR_array();
        int result = caller.xorOperation(n,start);
        System.out.println("Result = "+result );
    }
    public int xorOperation(int n, int start) {
        int nums[] =new int[n];
        int sum = 0;
        for(int i = 0;i< n; i++)
        {
            nums[i] =start + 2*i;
            sum = sum ^ nums[i];
        }
        return sum;
    }
}
