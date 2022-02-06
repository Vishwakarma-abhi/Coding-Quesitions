import java.util.*;
public class Even_ODD_digiits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {12,25,256,1565};
        System.out.println("Original Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        Even_ODD_digiits caller = new Even_ODD_digiits();
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if((caller.count(arr[i]) % 2) == 0)
            {
                counter++;
            }
        }
        System.out.println("\nThe number of digits which have Even Number of Digits  = "+counter);

    }

    public int count(int n)
    {
        int result  = 0;
        while(n != 0)
        {
            n = n / 10;
            result++;
        }
        return result;
    }
    
}
