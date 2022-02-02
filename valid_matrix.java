public class valid_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean result=false;
        for(int i = 0;i < matrix.length; i++)
        {
            for(int j = 0;j < matrix.length; j++)
            {
                if( matrix[i][j] <= n)
                {
                    result = true;
                    
                }
                else
                {
                    result = false;
                }
                n--;
                

            }
            
        }
    }
    
}
