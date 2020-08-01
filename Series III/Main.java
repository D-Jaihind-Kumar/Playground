#include<stdio.h>
int main()
{
  int n,a=6;
  scanf("%d",&n);
  for(int i=1;i<=n;i++)
  {
   printf("%d ",a);
    a=a+(5*i);
  }
}