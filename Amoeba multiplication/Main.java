#include<iostream>
using namespace std;
int main()
{
  int a1,a2,a3,n,i;
  cin>>n;
  a1=0;
  a2=1;
  
  for(i=3;i<=n;i++)
  {
    a3=a1+a2;
    a1=a2;
    a2=a3;
    
  }
  cout<<a3<<endl;
}