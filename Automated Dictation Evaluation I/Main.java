#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char str1[100], str2[100];
  cin >> str1;
  cin >> str2;
  if(strcmp(str1, str2) == 0)
    cout << "It is correct";
  else cout << "It is wrong";
  return 0;
}