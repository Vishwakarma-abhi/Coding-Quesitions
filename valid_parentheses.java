import java.util.Scanner;
import java.util.Stack;

public class valid_parentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your String of Brackets");
        String str = sc.nextLine();

        if (valid_brackets(str)) {
            System.out.println("Valid Parentheses");
        } else {
            System.out.println("Not a Valid Parentheses");
        }

    }

    static boolean valid_brackets(String str) {
        Stack<Character> brackets = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
                brackets.add(str.charAt(i));
            }

            else {
                if (brackets.isEmpty()) {
                    return false;

                }
                char c = brackets.peek();

                if (str.charAt(i) != ')' && c == '(') {
                    return false;
                }
                if (str.charAt(i) != ']' && c == '[') {
                    return false;
                }
                if (str.charAt(i) == '}' && c == '{') {
                    return false;
                }

                brackets.pop();

            }

        }
        return brackets.isEmpty();

    }

}
