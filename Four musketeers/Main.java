#include<iostream>
#include<stdio.h>
using namespace std;
int main()
{
  int x1,y1, x2, y2, x3, y3;
  cin >> x1;
  cin >> y1;
  cin >> x2;
  cin >> y2; 
  cin >> x3; 
  cin >> y3; 
  float x = (float)(x1+x2+x3)/3 , y =  (float)(y1 + y2 + y3)/3;
  cout << x <<endl;
  cout << y << endl;

  return 0;
}