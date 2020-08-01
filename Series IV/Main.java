#include<stdio.h>
int main()
{
  int n,i,x;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    x=i*i;
    if(x%2==0)
      printf("%d ",x-2);
    else
      printf("%d ",x-1);
  }
}