#include<iostream>
using namespace std;
int main()
{
  int r, c;
  cin>> r;
  cin>> c;
  int *ary[r];
  for(int i = 0; i <r ;i ++)
    ary[i] = (int*)malloc(c*sizeof(int));
  int max = 0;
  for(int i = 0; i <r; i ++){
    for(int j = 0; j < c; j ++){
      cin>> ary[i][j];
       if(max < ary[i][j])
        max = ary[i][j];
    }
  }
  cout << "The maximum element is " << max;
    return 0;
}