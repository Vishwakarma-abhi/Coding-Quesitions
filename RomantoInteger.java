public class RomantoInteger {
    public static void main(String[] args) {
        
        
        String s= "MCMXCIV";

        int num=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == 'I' )
            {
                num=num+1;
            }
            if(s.charAt(i) == 'V' )
            {
                num=num+5;
            }
            if(s.charAt(i) == 'X' )
            {
                num=num+10;
            }
            if(s.charAt(i) == 'L' )
            {
                num=num+50;
            }
            if(s.charAt(i) == 'C' )
            {
                num=num+100;
            }
            if(s.charAt(i) == 'D' )
            {
                num=num+500;
            }
            if(s.charAt(i) == 'M' )
            {
                num=num+1000;
            }
        }
        System.out.println(num);
    }
    
}
