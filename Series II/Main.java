#include<bits/stdc++.h>
using namespace std;
int main(){
  	int n, t = 121, d= 104;
  	cin >> n;
  	for(int i = 1; i <= n ; i ++){
      	cout << t << " ";
      	t += d;
     	d += 32;
    }
  return 0;
}
  	