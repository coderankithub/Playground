#include<iostream>
using namespace std;
int main()
{
  int n, steps = 0;
    cin >> n;
    while(n != 1){
      cout << n << '\n';
      if(n&1)
          n = 3*n+1;
      else 
        n = n / 2;
      steps ++;
    }
    cout << "1\n" <<  steps;
  return 0;  
}