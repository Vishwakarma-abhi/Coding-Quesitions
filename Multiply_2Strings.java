import java.util.Scanner;

public class Multiply_2Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = "159";
        String num2 = "126";
        System.out.println("String 1 --> "+num1);
        System.out.println("String 2 --> "+num2);
        int result;

        //1st Approach
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        result = n1 * n2 ;
        System.out.println("Multiplication of two strings = "+result);
        
    }   
    
}
