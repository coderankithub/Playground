#include<iostream>
char* check(int ary[], int k, int n){
  for(int i = 0; i < n ; i ++)
    	if(ary[i] == k)
          	return "She passed her exam";
  return "She failed";
}
int main()
{
  int n;
  std:: cin >> n;
  int ary[n], k;
  for(int i = 0; i< n; i ++)
    	std:: cin >> ary[i];
  std:: cin >> k;
  std:: cout << check(ary, k,n);
  return 0;
}