#include<bits/stdc++.h>
using namespace std;
int main(){
  	int n, t = 6;
  	cin >> n;
  	for(int i = 1; i<= n;i ++){
      	cout << t << " ";
      	t += 5 * (i);
    }
  return 0;
}