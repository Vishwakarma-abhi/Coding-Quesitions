import java.util.Scanner;

public class snake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mat[][] = new int[4][4];

        System.out.println("Enter the elements in the matrix");
        for(int  i = 0 ; i < 4; i++)
        {
            for (int j = 0; j < 4; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Snake Pattern ");
        snake_pattern(mat,4);

    }

    public static void snake_pattern(int[][] mat, int r)
    {

        for (int i = 0; i < r; i++) {
            
            if(i % 2 == 0)
            {
                for (int j = 0; j < mat.length; j++) {
                    System.out.print(mat[i][j]+" --> ");
                }
            }
            else
            {
                for (int j = r - 1; j >= 0; j--) {
                    System.out.print(mat[i][j]+" <--");
                    
                }
            }
            System.out.println();
        }
    }
    
}
