#include<iostream>
using namespace std;
int main()
{
  int r, c;
  cin >> r;
  cin >> c;
  int *ary[r];
 for(int i = 0; i < r; i ++)
  ary[i] = (int*)malloc(c*sizeof(int));
  for(int i = 0; i < r ;i ++){
    for(int j= 0;j <c; j ++)
      cin >> ary[i][j] ;  
  }
  for(int i = 0; i < c; i ++){
    int max = ary[0][i];
  	for(int j = 1; j < r; j ++){
      if(max < ary[j][i])
        max = ary[j][i];
    }
    cout << max << endl;
  }
  return 0;
}