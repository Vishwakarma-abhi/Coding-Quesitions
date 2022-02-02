import java.util.Scanner;

class pattern
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int mat[][] =new int[5][5];

        for(int i=1;i<5;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*"+"  ");
            }
            System.out.println();
        }
    }
}