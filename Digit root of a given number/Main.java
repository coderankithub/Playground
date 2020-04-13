#include<bits/stdc++.h>
using namespace std;
int digits(int k){
  int cnt = 0;
  while(k > 0){
    cnt ++;
    k /=10;
  }
  return cnt;
}
int digit_sum(int n){
  if(digits(n) <= 1)
    return n;
  return  digit_sum(digit_sum(n/10) + digit_sum(n % 10));
}
int main(){
	int n;
  	cin >> n;
  	cout << digit_sum(n);
  	return 0;
}