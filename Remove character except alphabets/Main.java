#include<iostream>
using namespace std;
int main()
{
  string token;
  cin >> token;
  for(int i = 0; i < token.length(); i ++){
    if(token[i] >= 97 && token[i] <= 121)
      cout << token[i];
    else if(token[i] >= 65 && token[i] <= 90)
      cout << token[i];
  }
  return 0;
}