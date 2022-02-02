import java.util.Scanner;

class matrix_triangle
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        matrix_triangle o1=new matrix_triangle();
        System.out.println("Enter the rows and columns for the matrix");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] matrix=new int[r][c];
        for(int i = 0 ; i < r ; i++ )
        {
            for(int j = 0 ; j < c ; j++ )
            {
                System.out.println("Enter "+i+j +" Element");
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("\n Our Matrix");
        for(int i = 0 ; i < r ; i++ )
        {
            for(int j = 0 ; j < c ; j++ )
            {
                System.out.print(matrix[i][j]+"  ");
                
            }
            System.out.println();
        }
        
        o1.left(matrix,r,c);
        o1.right(matrix,r,c);
    }

    public void left(int[][] matrix,int r,int c)
    {
        int lsum=0;
        for(int i = 0 ; i < r ; i++ )
        {
            for(int j = 0 ; j < c ; j++ )
            {
                if(i<= j)
                    lsum +=matrix[i][j];
               
            }
        }
        System.out.println("Upper triangle sum = "+lsum);
        
    }

    public void right(int[][] matrix,int r,int c)
    {
        int rsum=0;
        for(int i = 0 ; i < r ; i++ )
        {
            for(int j = 0 ; j < c ; j++ )
            {
                if(i>= j)
                    rsum +=matrix[i][j];
               
            }
        }
        System.out.println("lower triangle sum = "+rsum);
        
    }
}