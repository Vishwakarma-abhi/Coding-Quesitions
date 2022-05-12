import java.util.Scanner;

class pattern_new
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int k = 1;
        for (int i = 0; i < 6; i++) {

            for (int j = 0; j < i; j++) {

                System.out.print("*" + "   ");

            }
            System.out.println();
            
        }

        for (int i = 5; i >= 0; i--) {

            for (int j = 0; j < i; j++) {

                System.out.print("*" + "   ");

            }
            System.out.println();
            
        }
    }
}