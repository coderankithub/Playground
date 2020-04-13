#include<iostream>
#include<stdlib.h>
using namespace std;
int main(){
  int n;
  cin >> n;
  int *ary = (int*)malloc(n * sizeof(int));
  for(int i = 0; i < n; i ++)
    	cin >> ary[i];
  
  int even = 0, odd = 0;
  for(int i = 0; i < n ; i ++)
    if(ary[i] & 1)
      	odd ++;
  	else even ++;
  
  cout << odd << '\n' << even;
  return 0;
}