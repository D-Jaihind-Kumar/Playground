#include <stdio.h>
int main()
{
   // Try out your code here
  int m=2,n=3,req;
  scanf("%d%d%d",&m,&n,&req);
		int result=pow(m,n);
  if(req<=result)
  {
   printf("Doctor, you can proceed with your experiment.");
  }else
  printf("Sorry Doctor! You need more bacteria.");
   
}