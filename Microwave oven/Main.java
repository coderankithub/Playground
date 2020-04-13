#include<iostream>
using namespace std;
int main()
{
    int items;
    float ht_time;
    cin >> items;
    cin >> ht_time;
    if(items == 2)
          cout << (ht_time + (ht_time/2));
    else if (items == 3)
          cout << ht_time + ht_time;
  	else cout << "Number of items is more";
    return 0;  
}