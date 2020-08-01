#include<stdio.h>
int gcd(int *a,int *b)
{
  int result,small=0;
  if(*a<*b)
    small=*a;
  else
    small=*b;
  while(small>0)
  {
    if(*a%small==0 && *b%small==0)
    {
      result=small;
      break;
    }
    small--;
  }
  return result;
}
int main()
{
  int a,b,result,small=0;
  scanf("%d%d",&a,&b);
  result=gcd(&a,&b);
  printf("G.C.D of %d and %d = %d",a,b,result);
}