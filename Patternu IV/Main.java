#include <iostream>
using namespace std;
int main() {
    int n, t = 1;
  	cin >> n;
  	for(int i = 1; i <= n; i ++){
      if(i&1){
	      for(int j = 1; j <= n-1; j ++){
				cout << t;
          }
        cout << ++t;
        cout << endl;
      }
      else {
        cout << ++t;
        t --;
        for(int j = 2; j <= n; j ++)
          	cout << t ;
      t ++;
      cout << endl;
      }
    }
    return 0;
}