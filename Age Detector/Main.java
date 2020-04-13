#include<iostream>
using namespace std;
int main()
{
 	int by, cr;
  	cin >> by;
  	cin >> cr;
  	if( cr == 0 || by > cr)
      cr = cr + 100;
     cout << (cr- by);
  return 0;
}