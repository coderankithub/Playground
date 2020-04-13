#include<iostream>
using namespace std;
int sumZigZag(int r, int c, int**ary){
	int sum =  0;
  for(int i = 0; i< r; i ++){
    for(int j = 0; j < c; j ++){
      if(i ==0 || i == (r-1))
        sum += ary[i][j];
      else if(i == (r-j-1))
        sum += ary[i][j];
    }
  }
  return sum;
}
int main()
{
 int r, c;
  cin >> r;
  cin >> c;
  int *ary[r];
  for(int i = 0;i < r; i++)
    ary[i] = (int*)malloc(c*sizeof(int));
  
  for(int i = 0; i < r;i ++){
  	for(int j = 0;j < c; j++){
      cin >> ary[i][j];
    }
  }
  cout << "Sum of Zig-Zag pattern is " << sumZigZag(r, c, ary);
  return 0;  
}
