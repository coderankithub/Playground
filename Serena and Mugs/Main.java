#include<iostream>
using namespace std;
int main()
{
  int mugs, cup, tot = 0;
  cin >> mugs >> cup;
  int *vol = (int*)malloc( mugs * sizeof(int));
  for(int i = 0; i < mugs ; i ++){
    	cin >> vol[i];
  		tot += vol[i];
  }
  if(tot <= cup )
    cout << "YES";
  else cout << "NO";
  return 0;  
}