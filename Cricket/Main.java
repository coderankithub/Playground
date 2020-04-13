#include<bits/stdc++.h>
using namespace std;
int main()
{
    int balls, runs, b, r;
    cin >> balls;
    cin >> runs;
    cin >> b;
    cin >> r;
    int over = (balls/6);
    cout << over << '\n';
 	float over_finished = r/6 + (float)(r%6)/10, run_rate = (float)runs/over;
    cout << over_finished << '\n';
   float cur_run =  (float)(b/over_finished);
    cout << fixed << setprecision(1) << cur_run << '\n'; 
    cout << (float)run_rate << '\n';
  if(cur_run > run_rate)
    cout << "Eligible to Win";
  else cout << "Not Eligible to Win";
  return 0;
}