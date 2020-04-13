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
  
  for(int i = 0; i< r ;i ++){
    for(int j = 0; j < c;j ++)
      cin >> ary[i][j];
  }
  int sum = 0, max = 0, k;
  cout << "Sum of rows is " ;
  for(int i = 0; i< r ;i ++){
    for(int j = 0; j < c;j ++){
     sum += ary[i][j];
    }
   cout <<sum  << " ";
    if(max < sum){
      max = sum;
        k = i;
    }
    sum = 0;
  }
  cout << "\nRow " << (k+1) << " has maximum sum\n";  
  sum = 0;
  max = 0;
  cout << "Sum of columns is " ;
  for(int i = 0; i< c ;i ++){
    for(int j = 0; j < r;j ++){
     sum += ary[j][i];
    }
   cout <<sum << " ";
    if(max < sum){
      max = sum;
        k = i;
    }
    sum = 0;
  }
  cout << "\nColumn " << (k+1) << " has maximum sum\n";
}