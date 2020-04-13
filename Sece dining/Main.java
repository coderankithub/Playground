#include<iostream>
#include<string>
using namespace std;
int main()
{
    string ch;
    cin >> ch;
    int  rail;
    cin >> rail;
    if(ch == "front" ){
      if(rail == 1)
        cout << "Left Handed";
      else cout << "Right Handed";
    }
     else if(ch == "rear"){
       if(rail == 1)
         cout <<"Right Handed";
      else cout << "Left Handed";
     }
 	return 0;  
}