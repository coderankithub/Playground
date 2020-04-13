#include<iostream>
#include<string>
int main() 
{ 
  std:: string name;
  std:: getline(std:: cin,name);
  for(auto i = name.crbegin(); i != name.crend(); i ++)
    std:: cout << *i ;
  return 0;
}