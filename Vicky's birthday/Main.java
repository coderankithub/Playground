#include<bits/stdc++.h>
using namespace std;
int main(){
    int year;
    cin >> year;
    if(year%400 == 0)
          cout << "Vicky can celebrate his birthday.";
    else {
      if(year%4 == 0 && year%100 != 0)
          cout << "Vicky can celebrate his birthday.";
      else cout << "Vicky can't celebrate.";
    }
  return  0;
}
