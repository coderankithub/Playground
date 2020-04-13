#include<iostream>
using namespace std;
int main()
{
  int d, c, dd,cc;
  cin >> d;
  cin >> c; 
  cin  >> dd;
  cin >> cc;
  cout << (d+dd) + (c + cc)/100 << endl;
  cout << (c + cc)%100;
  return 0;
}