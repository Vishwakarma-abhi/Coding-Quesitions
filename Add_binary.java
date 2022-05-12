import java.util.Scanner;

public class Add_binary {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter the Two Binary numbers");
        System.out.println("Numner 1  : ");
        num1 = sc.nextInt();
        System.out.println("Numner 2  : ");
        num2 = sc.nextInt();

        int res = num1|num2;
        System.out.println("Result of Addition of above binary numbers  = "+res);
        
    }
    
}
