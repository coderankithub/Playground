#include<iostream>
using namespace std;
int main(){
  int n;
  cin >> n;
  if (n == 0 || n == 1)
    	cout << "Not eligible";
  else if(n % 2 == 0)
    	cout << "Not eligible";
  else {
    int i = 3, f = 0;
    for(; i <= (n / 2); i ++)
      	if(n % i == 0){
          f = 1;
          break;
        }
    if(f)
      	cout << "Not eligible";
    else cout << "Eligible";
  }
  return 0;
}