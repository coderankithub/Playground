#include<iostream>
using namespace std;
int main()
{
	int r ,c, i, j, flip = 1; 
  	cin >> r >> c;
	int *a[r]; 
	for (i=0; i<r; i++) 
		a[i] = (int *)malloc(c * sizeof(int));  
	for (i = 0; i < r; i++) {
	  for (j = 0; j < c; j++) {
      }
    	flip = !flip;
    }
  if(flip)
    cout << "Mani Iyer";
  else cout << "Arun Gupta";
     return 0; 
}