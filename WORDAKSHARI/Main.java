#include<iostream>
using namespace std;
int main()
{
  string input, temp;
  bool flag = true;
  cin >> input;
  cout << input << '\n';
  while(flag){
      if(input == "####")
        	flag = false;
      else {
        temp = input;
         cin >> input;
        int l = temp.length();
        if(temp[l-1] == input[0])
          cout << input << '\n';
      }
  }
    
  return 0;
}