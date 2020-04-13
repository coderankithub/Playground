#include<iostream>
using namespace std;
int main()
{
  int r, c;
  cin >> r;
  cin >> c;
  int ary[r][c];
  for(int i = 0; i < r; i ++){
    for(int j = 0; j < c; j ++){
      cin >> ary[i][j];
    }
  }
   for(int i = 0; i < c; i ++){
    for(int j = 0; j < r; j ++){
     cout << ary[j][i] << " " ;
    }
     cout << '\n';
   }
  return 0;  
}