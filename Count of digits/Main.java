#include<iostream>
int main()
{
	int n, digits = 0;
  	std:: cin >> n;
  	do {
      digits ++;
      n /= 10;
    }while(n!= 0);
  std:: cout << digits;
  return 0;
}