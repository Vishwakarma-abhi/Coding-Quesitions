/*Reverse a String*/
import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String value");
        String str=sc.next();
        Reverse_String rev=new Reverse_String();
        System.out.println("Reversed String is  "+rev.reverseWord(str));
        
    }
    public static String reverseWord(String str)
    {
        int n=str.length();
        String res="";
        for(int i = n-1 ;i  >= 0 ;i--)
        {
            res += str.charAt(i);
        }
        
        return res;
        
        
    }
}
