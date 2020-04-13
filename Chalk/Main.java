#include<bits/stdc++.h>
using namespace std;
int main()
{
    int days = 0;
    float sq,n;
    cin >> n;
    days = n;
    sq = 1/sqrt(n);
    while( n >= 1){
      days +=n*sq;;
      n = n * sq;
    }
    cout << days ;
  return 0;
}