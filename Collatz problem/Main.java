#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,x,y;
  cin>>n;
  int temp=n;
  int count=0;
  cout<<n<<endl;
  while(n>1){
  	if(n%2==0)
    { 
      n=n/2;
     
    cout<<n<<endl;
    count++;}
  	else{
      
      n=3*n+1;
    cout<<n<<endl;
    count++;}
  }
  cout<<count;
}