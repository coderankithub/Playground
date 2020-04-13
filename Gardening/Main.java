#include<iostream>
using namespace std;
int main()
{
  int r, c, trees;
  cin >> r >> c >> trees;
  int row_no = trees / c;
  if(trees % c != 0)
    row_no ++;
  if(row_no == 2 || row_no == r -1)
    cout << "It is a mango tree";
  else 
    cout << "It is not a mango tree";
  return 0;
}