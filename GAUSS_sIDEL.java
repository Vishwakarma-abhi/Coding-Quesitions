import java.util.Scanner;

class GAUSS_sIDEL
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][]= new int[200][200];
        int n =  sc.nextInt();
        int b[] =new int[200];
        int x[] = new int[20];
        for (int i = 0; i < N; i++) 
        {
            for (int j = 0; j < N-1; j++) {
                arr[i][j] = 0;
                b[i] = 0; 
                x[i] = 0;
            }
            
        }


        for (int i = 1; i < N; i++) {
            for (int j = 1; j < x.length; j++) {
                arr[i][j] = sc.nextInt();
            }
            b[i] = sc.nextInt();

        }


        for (int i = 1; i < N; i++) {
            x[i] =sc.nextInt();
            
        }

        int c = 0 , m = 1;
        for (int i = 1; i < N; i++) {
            int s = 0;
            for (int j = 1; j < N; j++) {
                if(i != j)
                {
                    s += arr[i][j] * x[j];
                }
                int X = (b[i] - s)/arr[i][j];

                if(Math.abs(X-x[i]))
            }
            
        }
            
    }
}