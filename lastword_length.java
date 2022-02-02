import java.util.Scanner;

public class lastword_length {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        String str;
        System.out.println("Enter your String or sentence");
        str = sc.nextLine();
        lastword_length call = new lastword_length();

        int result = call.lengthOfLastWord(str);
        System.out.println("Length of Last Word is "+ result);
    }
    
    public int lengthOfLastWord(String s) {
        
        String result[] = s.split(" ");
        
        int rlen = result.length;
        return result[rlen -1].length();
        
    }
}
