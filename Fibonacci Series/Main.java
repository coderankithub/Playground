#include<iostream>
int fibonacci(int n){
  if(n == 1)
    	return 0;
  else if(n == 2)
    	return 1;
  return fibonacci(n-1) + fibonacci(n-2);
}
int main()
{
  int n;
  std:: cin >> n;
  std:: cout << "The term " << n << " in the fibonacci series is " << fibonacci(n);
  return 0;
}