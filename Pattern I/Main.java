#include<bits/stdc++.h>
using namespace std;
int main(){
  	int n, t, r = 4;
  	cin >> n;
  	t = n;
  	for(int i = 1; i <= 8; i ++){
      if( i <= 4){
	      for(int j = 1; j <= i; j ++){
            	cout << t;
          }
        cout << endl;
        t ++;
      }
      else {
        t --;
        for(int j = 1; j <= r; j ++)
          	cout << t;
        cout << endl;
        r --;
      }
    }
  return 0;
}
       
            