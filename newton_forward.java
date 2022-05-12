import java.util.Scanner;

public class newton_forward {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the no. of Points ");
        int n =  sc.nextInt();

        float x[] = new float[n];
        float y[] = new float[n];

        float result[][] = new float[n][n];

        System.out.println("Enter the value of to be calculated ");
        float X =  sc.nextFloat();

        System.out.println("Enter the values of t for the table ");
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextFloat();
            
        }

        System.out.println("Enter the values of S for the table ");
        for (int i = 0; i < n; i++) {
            y[i] = sc.nextFloat();
            
        }

        System.out.println("Enter the space length ' h ' ");
        float h = sc.nextFloat();


        for (int j = 0; j < n; j++) {
            result[0][j] = y[j];
        }


        for (int i = 1; i < n; i++) {

            for (int j = 0; j < (n-i); j++) {

            
                result[i][j] = result[i-1][j+1] - result[i-1][j];
                
            }   
        }

        float sum = 0;        
        for (int i = 1; i < n; i++) {
            sum =sum + ()
            
        }

        System.out.println("Value of Y"+ (sum/h));
    }
    
}
