import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int X;
        float Y;
        X = sc.nextInt();
        Y = sc.nextFloat();
        float charges = 0.5+X;
        if(charges < Y && X % 5 == 0)
        {
            Y -= charges;
            System.out.println(Y);
        }
        else
        {
            System.out.println(Y);
        }
    }
    
}
