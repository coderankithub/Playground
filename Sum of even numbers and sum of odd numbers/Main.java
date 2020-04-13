#include<iostream>
#include<stdio.h>
using namespace std;
int* even_odd_sums(int n, int* ary){
  int *result = (int*)calloc(2,sizeof(int));
  for(int i = 0; i <n ; i ++){
    if(ary[i] &1)
      result[1] += ary[i];
    else result[0] += ary[i];
  }
   return result;
  }
int main()
{
  int n;
  cin >> n;
  int *ary= (int*)malloc(n*sizeof(int));
  for(int i = 0;i < n ; i ++)
    cin >> ary[i];
  int * ans = even_odd_sums(n, ary);
  cout << "The sum of the even numbers in the array is " << ans[0] << '\n' ;
  cout << "The sum of the odd numbers in the array is " << ans[1];
  return 0;
}