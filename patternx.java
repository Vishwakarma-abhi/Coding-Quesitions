import java.util.Scanner;

public class patternx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int patX[][] = new int[3][3];

        for (int i = 0; i < 5; i++) {
            for(int j = 5; j >= i; j--) {
                System.out.print("*"+"  ");
                
            }
            System.out.println();
            
        }

        for (int i = 0; i < 5; i++) {
            for(int j = 1; j >= i; j--) {
                System.out.print("*"+" ");
                
            }
            System.out.println();
            
        }
        for (int i = 0; i < 5; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("*"+"  ");
                
            }
            System.out.println();
            
        }

        


    }
    
}
