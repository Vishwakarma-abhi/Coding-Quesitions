import java.util.Scanner;

public class palindrome_rec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String ");
        String str = sc.nextLine();

        palindrome_rec obj = new palindrome_rec();
        boolean result = obj.check(str, 0 ,str.length() - 1);
        if(result)
            System.out.println(str+" is palindrome");
        else
        {
            System.out.println("Not Palindrome");
        }
    }

    public static boolean check(String str , int s, int e)
    {
        //termination condition
        if(s == e)return true;

        if(str.charAt(s) != str.charAt(e))
            return false;
        
        if(s < e)
            return check(str, s+1, e-1);
        
        return true;
    }
    
}
