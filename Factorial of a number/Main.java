#include<iostream>
using namespace std;
int main(){
    int n, fac = 1;
  cin >> n;
    for(int i = 2; i <= n;i++)
      fac *= i;
    cout << fac;
  return 0;
}