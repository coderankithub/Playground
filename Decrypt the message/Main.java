#include<bits/stdc++.h>
using namespace std;
int main(){
  int num1, num2, temp, sum;
  cin >> num1;
  cin >> num2;
  sum = num1+num2;
    for(int i =1;i <= sum/2; i ++)
      	if(sum %i == 0)
          	temp += i;
  if(temp == sum)
    	cout << "They can read the message";
 else cout << "They can't read the message";
    return 0;
}