#include<iostream>
using namespace std;
int main()
{
  int n, score = 0, t = 0, s = 0;
    cin >> n;
   do {
     s ++;
     cin >> score;
     t += score;
   }while(t < n);
      cout << "The number of turns is " << s;
  return 0;
} 