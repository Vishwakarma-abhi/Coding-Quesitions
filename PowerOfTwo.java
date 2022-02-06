public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 16;
        int i = 1;
        int temp;
        while ( temp != n)
        {
            temp = Math.pow(2, i);
            i++; 
        }
        if(temp == n )
        {
            System.out.println("Mission Pass");
        }
        else{
            System.out.println("Mission Fail");
        }
    }
    
}
