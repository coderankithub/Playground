#include<iostream>
using namespace std;
int main(){
  int n,k =1, t = 0;
  cin >> n;
  for(int i = 1; i <= (n*2); i ++){
    if(i <= (n)){
      t ++;
      for(int j = 1 ;j <= k; j ++){
      	if(j&1)
          cout << t;
        else 
          cout << "*";
      }
      k += 2;
    }
    else {
      k-=2;
      for(int j = 1; j <= k; j ++){
      	if(j & 1)
          cout << t;
        else 
          cout << "*";
      }
	t--;      
    }
    cout << endl;
  }
  return 0;
}