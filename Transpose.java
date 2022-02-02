public class Transpose {
    public static void main(String[] args) {
        int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Original Matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3.; j++) {
                System.out.print(mat[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println();
        //transpose
        System.out.println("Transpose of the Matrix");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {

                if(i > j)
                {
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
                
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j]+"  ");
            }
            System.out.println();
        }
    }

}
