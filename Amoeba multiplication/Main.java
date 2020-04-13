#include<iostream>
using namespace std;
int main()
{
 int n;
  cin >> n;
  int ary[n+1];
  ary[0] = 0;
  ary[1] = 1;
  for(int i = 2; i <= n;i ++)
    	ary[i] = ary[i-1]+ary[i-2];
  	cout << ary[n-1];
  return 0;
}