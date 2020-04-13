#include<iostream>
using namespace std;
int main()
{
  int n, loc, value;
  cout << "Enter the number of elements in the array\n";
  cin >> n;
  int *ary = (int*)malloc((n+1) *sizeof(int));
  cout << "Enter the elements in the array\n";
  for(int i = 0; i < n;i ++)
    cin >> ary[i];
  cout << "Enter the location where you wish to insert an element\n";
  cin  >> loc;
  if(loc < 0 || loc > (n-1))
    cout << "Invalid Input";
  else {
    cout << "Enter the value to insert\n";
    cin >> value;
    int i = 0,temp;
    for(; i < loc-1; i ++);
    for( ; i < (n +1); i ++){
          temp = ary[i];
          ary[i] = value;
          value  = temp;
      }
    cout << "Array after insertion is \n";
    for(int i = 0; i < (n+1); i ++)
      cout << ary[i] << '\n';
  }
  return 0;
}