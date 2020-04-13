#include<iostream>
using namespace std;
int main()
{
  int age;
  float  time;
  cin >> age;
  cin >> time;
  if(age > 13){
  	if(time == (float)13.30 || time == 18.00)
      cout << "$5.00";
    else cout << "$8.00";
  }
   else {
  	if(time == (float)13.30 ||  time == 18.00)
      cout << "$2.00";
    else cout << "$4.00";
  }
  return 0;
}