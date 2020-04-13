#include<bits/stdc++.h>
using namespace std;
int main(){
	int a,b, c;
  cin >> a;
  cin >> b;
  cin >> c;
  cout << "Enter first number : Enter second number : Menu \n\
1.Addition\n\
2.Subtraction\n\
3.Multiplication\n\
4.Division\n\
5.Remainder\n";
  switch(c){
    case 1: cout << a+b;
      break;
      case 2: cout <<a-b;
      break;
      case 3:cout <<a*b;
      break;
      case 4: a/b;
      break;
    case 5: cout << a%b;
      break;
    default:cout << "Invalid operation";
      break;
  }
  return 0;
}
  