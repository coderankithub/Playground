#include<iostream>
using namespace std;
int main()
{
  int r, c;
  cin >> r;
  cin >> c;
  int *a[r], *b[r];
  for(int i = 0;i < r; i ++){
    a[i] = (int *)malloc(c *sizeof(int));
    b[i] = (int*)malloc(c*sizeof(int));
  }
  for(int i = 0; i< r ; i++){
    for(int j = 0; j  < c ; j ++){
      cin >> a[i][j];
    }
  }
  for(int i = 0; i< r ; i++){
    for(int j = 0; j  < c ; j ++){
      cin >> b[i][j];
      cout << (a[i][j] + b[i][j]) << " " ;
    }
    cout << endl;
  }
  return 0;
}