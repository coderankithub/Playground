#include<bits/stdc++.h>
using namespace std;
int main()
{
  int n;
  float score = 0;
  while(cin>> n){
	if(n >= 0){
      if(n&1)
        	score ++;
       else 
         score -= 0.5;
    }
    else {
      score -= 1;
      break;
    }
  }
  cout << score;
}