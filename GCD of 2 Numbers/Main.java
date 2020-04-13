#include<bits/stdc++.h>
using namespace std;
int gcd(int x, int y){
  if(x == 0)
    	return y;
  return gcd(y%x,x);
}
int main()
{
  int a, b;
  std:: cin >> a;
  std:: cin >> b;
  std:: cout << "G.C.D of " << a << " and " << b << " = " << gcd(max(a,b), min(a, b));
  return 0;
}