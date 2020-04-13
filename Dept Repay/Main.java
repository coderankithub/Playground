#include<bits/stdc++.h>
#include<stdio.h>
using namespace std;
int main()
{
    int p, r, t;
  double i,a;
  cin >> p >> r >> t;
    i = (p*r*t)/100;
    a = i+p;
  double c = (float)i/ 50;
  double d = a -c;
  cout << i << '\n' << a << '\n' << c << '\n' << d;
  return 0;
}