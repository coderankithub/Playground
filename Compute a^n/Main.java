#include<iostream>
using namespace std;
int power(int n, int exp){
	if(exp == 1)
      	return n;
  	return n * power(n, (exp-1));

}
int main()
{
  int n, pow;
  cout << "Enter the value of a";
  cin >> n;
  cout << "\nEnter the value of n\n";
  cin >> pow;
  cout << "The value of " << n << " power " << pow << " is " << power(n, pow);
  return 0;
}