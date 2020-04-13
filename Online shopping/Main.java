#include<iostream>
using namespace std;
int main()
{
    int a, b, c , x, y, z, p, q, r, f,s, amz;
    cin >> a;
    cin >> b;
    cin >> c;
    f =(a-(a*b/100))+c; 
    cout <<"In Flipkart Rs." << f << '\n';
    cin >> x ;
    cin >> y;
    cin >> z;
    s= (x-(x*y/100))+z;
    cout << "In Snapdeal Rs." << s << '\n';
    cin >> p;
    cin >> q;
    cin >> r;
    amz = (p-(p*q/100))+r;
    cout << "In Amazon Rs." << amz << '\n';
   	if(f <= s and f <= amz)
     	cout << "He will prefer Flipkart";
    else if(s < amz)
     	cout << "He will prefer Snapdeal";
    else 
        cout <<"He will prefer Amazon";
 return 0;           
}