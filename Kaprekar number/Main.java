#include<iostream>
using namespace std;
bool kaprekarNumber(int n){
	if(n == 1)
      return true;
  	int sq = n*n, cnt = 0, result = 0;
	while(sq > 0){
      cnt ++;
      sq /= 10;
    }
  if(cnt >= 2){
    int temp = n;
   n = 0;
  	while(temp > 0){
      n += temp%10;
      temp /= 10;
  }
  }
  sq  = n *n;
  for(int i = 1; i <= (cnt/2) ; i ++){
    	result += sq%10;
  		sq /= 10;
  }
 // cout <<result << endl;
  for(int i = 1; i <= (cnt/2); i ++){
    result += sq%10;
    sq /= 10;
  }
  //cout << result << " " << sq << endl;
  if(result == n)
    	return true;
  return false;    
}
int main()
{
  int k;
  cin >> k;
  if(kaprekarNumber(k))
    cout << "Kaprekar Number";
  else cout << "Not a Kaprekar Number";
  return 0;  
}