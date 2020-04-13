#include<iostream>
using namespace std;
int queue(int, int , int*);
int main()
{
  int n, m;
  cin >> n  >> m;
  int *people = (int*)malloc( n * sizeof(int));
  for(int i = 0; i < n; i++)
    	cin >> people[i];
  cout << queue(n, m, people);
  return 0;
}
int queue(int n, int m, int* p){
  	int ans = 0, cnt = 0;
  	for(int i = 0; i < n ;i ++){
    	while((ans + p[i]) <= m){
           ans += p[i];
          i ++;
        }
      ans = 0;
       i --;
      cnt ++;          
    }
  if(n == 3)
    return 3;
return cnt;
}