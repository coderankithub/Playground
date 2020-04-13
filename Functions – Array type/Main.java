#include<iostream>
using namespace std;
int check(int n, int *ary){
  int e = 0, o = 0;
  for(int i = 0; i < n ;i ++){
    if(ary[i]&1)
      o ++;
  	else e ++;
	}
  return (o == n)? 2:(e == n)?1: 3;
}
int main()
{
  int n, *ary;
  cout << "Enter the number of elements in the array\n";
  cin >> n;
  cout << "Enter the elements in the array\n";
  ary = (int*)malloc(n*sizeof(int));
  for(int i = 0;i < n ; i ++)
    cin >> ary[i];
 	
  (check(n, ary) == 1)?cout << "The array is Even":(check(n, ary)== 2)? cout << "The array is Odd": cout << "The array is Mixed";  
    return 0;  
}