#include <iostream>
using namespace std;
int main() 
{
	// Type your code here
  int n;
  cin>>n;
  while(n>0)
  {
  int last_digit=n%10;
  n=n/10;
  cout<<last_digit;
  }
	return 0;
}