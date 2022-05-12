public class PowerOfTwo {
    public static void main(String[] args) {
        int num = 15;
        
        int mask = 1;
        boolean res = false;
        while(num != mask)
        {
            if(num == mask)
            {
                res = true;
                break;

            }
            mask = mask << 1;
        }
        System.out.println(mask);
        if(res)
        {
            System.out.println("false");
        }
        else{
            System.out.println("true");
        }

      
        
        
    }
    
}
