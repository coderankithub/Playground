#include<iostream>
using namespace std;
int main()
 {
    int radius, square;
    cin >> radius;
    cin >> square;
    if(radius <= square/2)
      cout << "circle can be inside a square";
     else cout << "circle cannot be inside a square";
    return 0;
}