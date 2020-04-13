#include<iostream>
using namespace std;
int main()
{
    int n, t,sum = 0;
    cin >> n;
    t = n;
    while(n > 0){
      sum += n %10;
      n /= 10;
    }
    if(t%sum == 0)
          cout << "Harshad Number";
   else 
     cout << "Not Harshad Number";
  return 0;  
}