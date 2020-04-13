#include<iostream>
using namespace std;
int main()
{
  int x, y, z, box, code;
  cin >> x;
  cin >> y;
  cin >> z;
  if(x%x== 0 && y%x==0 && z%x ==0){
      code = x;
     if(y > x && y < z)
       box = y;
	else box = z;    
    }
    else if(x%y==0 && y%y == 0 &&z%y== 0)
    {
      code = y;
      box = max(min(x,y), min(x, z));
    }
    else if(x%z==0 && y%z == 0&& z%z== 0)
    {
     code = z;
       box = max(min(x,y), min(x, z));
    }
  else {
    code = 1;
    box = max(min(x,y), min(x, z));
    }
   cout << "The treasure is in box which has number "<< box;
  cout << "\nThe code to open the box is " << code;
  return 0;
  }