#include<iostream>
using namespace std;
int main(){
  int n;
  cin >> n;
  int l = 1, r = n*n+1;
  for(int i = n; i > 0; i --){
    for(int s = n; s > i;  s --){
      cout << "--";
    }
    for(int j = 1; j <= i ; j ++){
      cout <<l << "*";
      l ++;
    }
    for(int j = 1; j <= i; j ++){
      cout << r;
      if(j < i)
        cout << "*";
      r ++; 
    }
    r = r - (i-1)*2 -1;
    cout << endl;
  }
  return 0;
}