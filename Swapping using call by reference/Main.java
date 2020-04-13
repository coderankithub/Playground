#include<bits/stdc++.h>
using namespace std;
void swap(int &a, int &b){
  	int temp  = a;
  	a = b;
  	b = temp;
}
int main(){
	int a, b;
  	cin >> a >> b;
  	cout << "Before swapping a= "<< a <<" and " << "b=" << b;
  	swap(a, b);
  	cout << "\nAfter swapping a= "<< a <<" and " << "b=" << b;
      return 0;
}