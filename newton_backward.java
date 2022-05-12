import java.util.Scanner;

public class newton_backward {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the no. of Points ");
        int n =  sc.nextInt();

        float x[] = new float[n];
        float y[] = new float[n];

        float result[][] = new float[n][n];

        //Asking Point   ( 57 ,58 , 59  ,60 ,  61 )
        System.out.println("Enter the value of X");
        float X =  sc.nextFloat();

        System.out.println("Enter the values of x for the table ");
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextFloat();
            
        }

        System.out.println("Enter the values of y for the table ");
        for (int i = 0; i < n; i++) {
            y[i] = sc.nextFloat();
            
        }

        System.out.println("Enter the space length ' h ' ");
        float h = sc.nextFloat();


        for (int j = 0; j < n; j++) {
            result[0][j] = y[j];
        }


        do
        {
            for (int i = 1; i < n; i++) {

                for (int j = i; j < n; j++) {
    
                
                    result[i][j] = result[i-1][j] - result[i-1][j-1];
                    
                }   
            }
    
            float u = (X - x[n-1])/h;
            float  Y= y[n-1];
            float p = 1;
            
            for (int i = 1; i < n; i++) {
    
                p = p * (u + i - 1)/i;
                Y = Y + p * result[i][n-1];
                
            }
    
            System.out.println("Value of Y   at X =  "+X+"  = " + Y);
            X++;

        }while(X != 62);

        





        

    }
    
}
