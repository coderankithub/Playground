#include<bits/stdc++.h>
using namespace std;
int main(){
  int n, k = 0, t = 1;
  cin >> n;
  for(int i = 1; i <= n ; i++){
     if(i&1){
          t = t+(i-1);
           for(int j = 1; j <= (i+k) ; j ++){
                if(j &1){
                  cout << t;
                  t ++;
                }
                 else 
                   cout <<"*";
              }
       t--;
    }
    else {
   		t = t+i;
    for(int j = 1; j <= (i+k) ; j ++){
      if(j &1){
        cout << t;
        t --;
      }
       else 
         cout <<"*";
    }
      t ++;
    }	
    cout << endl;
    k++;
  }
  return 0;
}