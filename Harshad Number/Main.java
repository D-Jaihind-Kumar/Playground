#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int sum=0;
  int temp =n;
  while(n>0){
    int ld=n%10;
  	sum=sum+ld;
  	n=n/10;
  }
	int h=temp%sum;
  if(h == 0){
    cout<<"Harshad Number";
  }
    else
    { cout<<"Not Harshad Number";}
}