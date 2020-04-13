#include<iostream>
using namespace std;
int main()
{
   int units,charges = 0;
    cin >> units;
    if(units <= 200)
      charges = units*0.5;
    else if(units <= 400)
      charges = units*0.65+100;
    else if(units <= 600)
          charges = units*0.80+200;
    else charges = units*1.25+425;
    cout << "Rs."<< charges;
  return 0;
}