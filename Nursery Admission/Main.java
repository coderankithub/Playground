#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char name[100];
  cin >> name;
  cout << "The number of letters in the name is " << strlen(name);
  return 0;
}