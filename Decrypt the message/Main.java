#include<iostream>
using namespace std;
int main()
{
  int a,b,sum;
  cin>>a>>b;
  int c=a+b;
  for(int i=1;i<c;i++)
  {
	int div=c%i;
    if(div==0)
    sum=sum+i;
   }
  if(sum==c)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
}