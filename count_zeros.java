import java.util.Scanner;

public class count_zeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[5][5];

        System.out.println("Enter the elements in the array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] =sc.nextInt();
            }
        }
        count_zeros caller = new count_zeros();
        System.out.println();
        int result = caller.countZeros(arr, 5);
        System.out.println("Result  = "+result);

    }
    int countZeros(int A[][], int N)
    {
        int count = 0;
        for(int i = 0 ; i < N;i++)
        {
            for(int j = 0 ; j < N ;j++)
            {
                if(A[i][j] == 0)
                {
                    count++;
                }
            }
        }
        return count;
    }
}
