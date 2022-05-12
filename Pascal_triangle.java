import java.util.*;
public class Pascal_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char mat[][] = new char[5][9];
        int row = 5, col =9;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                
                if(((i+j) >= row ) || ((i+j) >= col))
                {   
                    if(((i+j) % 2 ) == 0)
                    {
                        
                    }
                    
                }
                else
                {
                    mat[i][j] =' ';
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

    }
    
}
