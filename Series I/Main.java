#include<bits/stdc++.h>
using namespace std;
int main(){
  	float n, t = 0.5;
    cin >> n;
    for(int i = 1; i <= n;i++){
          cout << t << " " ;
          t =  0.5 * pow(3, i);
    }
  return 0;
}