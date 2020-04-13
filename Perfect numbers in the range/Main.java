#include<bits/stdc++.h>
using namespace std;
int main(){
  int l,r;
  cin >> l;
  cin >> r;
  for(int i = l; i <= r; i ++){
    int temp = 0;
    for(int j = 1; j <= (i/2); j ++){
      if(i % j == 0)
        	temp += j;
    }
    if(temp == i)
      	cout << i << " " ;
  }
  return 0;
}