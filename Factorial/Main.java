#include <stdio.h>
int fact(int a)
{
  int f=1;
  for(int i=1;i<=a;i++)
  {
    f=f*i;
  }
  return f;
}
int main()
{
  int n,i,f;
  scanf("%d",&n);
    f=fact(n);
  printf("The factorial of %d is %d",n,f);
   return 0;
}