#include<stdio.h>
int main()
{
    int i,j,n;
    scanf("%d",&n);
    int b=n;
    for(i=0;i<4;i++)
    {         for(j=0;j<=i;j++)
            {  
             printf("%d",b);
           }
           printf("\n");
           b++;
   }
    b--;
   for(i=0;i<4;i++){
       for(j=0;j<4-i;j++){
           printf("%d",b);
       }
       printf("\n");
       b--;
   }
            
}