import java.util.Scanner;

public class nth_fibo {
    public static void main(String[] args) {
        nth_fibo obj=new nth_fibo();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Nth position to get the fibonacci number");
        int n=sc.nextInt();
        int num = obj.fibo(n);
        System.out.println(n+"th fibonacci number is "+num);

        
    }
    int fibo(int n)
    {
        //base case
        if(n <= 1)return n;


        //recurvive equation
        return fibo(n-1)+fibo(n-2); 
    }    
    
}
