import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a number");
        num = sc.nextInt();

        armstrong caller = new armstrong();
        caller.checker(num);
    }

    public void checker(int num)
    {
        int temp =  num;
        ArrayList<Integer> arr = new ArrayList<>();
        if(num == 0 || num == 1)
        {
            System.out.println("Armstrong number");
        }
        while(num != 0)
            {
                int rem = num % 10;
                arr.add(rem);
                num = num / 10;
                
            }
        int arm = 0;
        for (int i = 0; i < arr.size(); i++) {
            arm += Math.pow(arr.get(i),arr.size());  
        }
        if(temp == arm)
        {
            System.out.println("Armstrong number");
        }
        else
        {
            System.out.println("Not a Armstrong number");
        }
        
        

    }
    
}
