#include<bits/stdc++.h>
using namespace std;
int main(){
	int a, b, c, ans;
  	cin >> a;
   	cin >> b;
  	cin >> c;
  	cin >> ans;
  	int i = min(a , min(b,c));
  	for(; i >= 1; i --){
      if(a %i == 0 && b %i == 0 && c %i ==0)
        	break;
    }
    if(i == ans)
          cout << "Answer is correct.";
    else cout << "Answer is wrong.";
  return 0;  	
}