#include<iostream>
using namespace std;
int main()
{
 string s1, s2;
  cin >> s1;
  cin >> s2;
  bool flag = true;
  int j = 0;
  for(auto i = s2.crbegin(); i != s2.crend(); i ++){
    if(s1[j++] != *i){
      flag = false;
      break;
    }
  }
  if(flag)
    cout << "It is correct";
  else 
    cout << "It is wrong";
  return 0;
}