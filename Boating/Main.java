#include<iostream>
using namespace std;
int main()
{
    int w, a, c;
    cin >> w;
    cin >> a;
    cin >> c;
    int temp = a*75+c*30;
    if(temp <= w)
          cout << "Boat is stable";
    else cout << "Boat will drow";
  return 0;
}