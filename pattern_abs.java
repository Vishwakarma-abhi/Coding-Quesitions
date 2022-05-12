import java.util.*;
class pattern_abs
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  ch = 65;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {

                System.out.print((char)ch+"  ");
                ch++;
                
            }
            System.out.println();
        }
    }
}