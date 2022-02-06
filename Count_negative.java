import java.util.Scanner;

public class Count_negative {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int arr[][] = {{4,3,2,-1},
                        {3,2,1,-1},
                        {1,1,-1,-9},
                        {-1,-1,-2,-3}};
        System.out.println("Original Array ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+ "  ");
            }
            System.out.println();
        }
        Count_negative caller =new Count_negative();
        int count = caller.countNegatives(arr);
        System.out.println("Total Number of Negative digits in the array is  = "+ count);

    }
    public int countNegatives(int[][] grid) {
        int res = 0;
        for(int i = 0;i < grid.length; i++)
        {
            for(int j = 0;j < grid[i].length; j++)
            {
                if(grid[i][j] < 0)
                {
                    res++;
                }
                

            }
            
        }
        return res;
    }
    
}
