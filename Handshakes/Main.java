#include<iostream>
using namespace std;
int main()
{
  int n, hand_shake;
  cin >> n;
  for(int i = 1; i <= n; i ++){
    for(int j = i+1; j <= n; j++)
      	hand_shake ++;
  }
  cout << hand_shake;
  return 0;
}