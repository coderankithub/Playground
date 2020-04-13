#include<iostream>
using namespace std;
char* magicSquare(int n, int ** ary){
	int r_sum  = 0 , c_sum = 0, d_sum = 0;
  	for(int j = 0;j < n; j ++){
      r_sum += ary[0][j];
      d_sum += ary[j][j];
    }
  	if(r_sum != d_sum)
      return "No";
 	for(int i = 1; i < n; i ++){
      c_sum = 0;
    	for(int j = 0; j < n; j ++){
          c_sum += ary[j][i];
        }
      if(r_sum != c_sum )
        return "No";
    }
  return "Yes";
}
int main()
{
  int n;
  cin >> n;
  int *ary[n];
  for(int i = 0; i < n; i ++)
    ary[i] = (int*)malloc(n*sizeof(int));
  
  for(int i = 0; i < n;i ++){
    for(int j = 0; j < n;j ++){
      cin >> ary[i][j];
    }
  }
	char *ans =  magicSquare(n, ary);
  	cout << ans;
  return 0;
}