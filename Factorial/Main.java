#include<iostream>
int factorial(int n){
  if(n <= 1)
    return 1;
  return n * factorial(n - 1);
}
int main()
{
  int n;
  std:: cin >> n;
  std:: cout << "The factorial of " << n << " is " << factorial(n);
  return 0;
}