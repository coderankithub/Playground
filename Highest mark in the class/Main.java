#include<iostream>
int main()
{
  int n;
  std:: cin >> n;
  int ary[n], max = 0;
  for(int i = 0;i< n;  i++){
	std:: cin >> ary[i];
    if(ary[i] > max)
      	max = ary[i];
  }
  std:: cout << max;
  return 0;  
}