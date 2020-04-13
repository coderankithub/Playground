#include<iostream>
using namespace std;
int main()
{
   int r, c, trees;
    cin >> r;
    cin >> c;
    cin >> trees;
    int temp = (c+(r-1) + (r-1));
    if(temp > trees)
          cout << "Yes";
    else cout << "No";
  return 0;
}