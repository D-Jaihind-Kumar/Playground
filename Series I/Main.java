#include<stdio.h>
int main()
{
  int n;
  float a=0.5;
  scanf("%d",&n);
  for(int i=1;i<=n;i++)
  {
    printf("%0.1f ",a);
    a=a*3;
  
  }
}