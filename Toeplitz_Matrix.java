import java.util.Scanner;

public class Toeplitz_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][] ={{1,2,3,4},{5,1,2,3},{9,5,1,2}};

        boolean check = false;

        for (int i = 0; i < arr.length - 1; i++) {
            
            for (int j = 0; j < arr[i].length - 1; j++) {
                if(arr[i][j] == arr[i+1][j+1])
                {
                    check = true;
                }
                else{
                    check = false;
                    break;
                }
            }
        }
        System.out.println(check);
    }
    
}
