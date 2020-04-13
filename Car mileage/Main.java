#include<iostream>
using namespace std;
int main()
{
    int m, l, d;
    cin >> m;
    cin >> l;
    cin >> d;
    if((l*m) >= d)
          cout << "Can reach";
    else cout << "Cannot reach";
  return 0;
}