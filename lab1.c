#include<stdio.h>
#include<math.h>
#include<conio.h>

#define e 0.0000001
#define f(x) x*exp(x) - 2 

void main()
{
    float x0 = 0,x1 = 1,m;
    float f0,f1,f2;
    int i = 0;
    

    // printf("Enter the initial value of x0 and x1");
    // scanf("%f %f ",&x0,&x1);
    
    do{
        f0 = f(x0);
        f1 = f(x1);
        m = (x0 + x1) / 2;
        f2 =f(m);
        
        if(f0 * f2 < 0 )
        {
            x1 = m;    
        }
        else
        {
            x0 = m;
        }
        i++;
        
        printf("Solution  %f \n",m);
        
    }while(fabs(f(m) / f2) > e);
   
    
    getch();
}