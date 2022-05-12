import java.util.*;
public class divided_difference {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("\n\t\tWelcome to Divided Differnce Calculation");
        System.out.println("\t\t***************************************\n");

        System.out.println("Enter the no. of Points ");
        int n =  sc.nextInt();

        float x[] = new float[n];
        float y[] = new float[n];

        float result[][] = new float[n][n];

        System.out.println("Enter the value of X");
        float X =  sc.nextFloat();

        System.out.println("Enter the values of x for the table ");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter x["+i+"]  ");
            x[i] = sc.nextFloat();
            
        }

        System.out.println("Enter the values of y for the table ");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter y["+i+"]  ");
            y[i] = sc.nextFloat();
            
        }

        


        for (int j = 0; j < n; j++) {
            result[0][j] = y[j];
        }


        for (int i = 1; i < n; i++) {

            for (int j = 0; j < (n-i); j++) {

            
                result[i][j] = (result[i-1][j+1] - result[i-1][j]) / (x[i+j] -x[j]);
                
            }   
        }

        
        float  Y= y[0];
        float p = 1;
        
        for (int i = 1; i < n; i++) {

            p = p * (X - x[i-1]);
            Y = Y + p * result[i][0];
            
        }

        System.out.println("Value of Y  = "+ Y);
    }
    
}
