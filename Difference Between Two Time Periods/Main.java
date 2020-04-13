#include<iostream>
using namespace std;
struct time {
  int hrs, min, sec;
};
void diffTimePeriod(struct time t1, struct time t2, struct time *diff){
	if(t1.sec  < t2.sec){
      -- t1.min;
      t1.sec += 60;
    }
  diff->sec = t1.sec - t2.sec;
  if(t1.min < t2.min){
    -- t1.hrs;
    t1.min += 60;
  }
  diff -> min =  t1.min- t2.min;
  diff  -> hrs = t1.hrs - t2.hrs;
}  

int main()
{
 struct time t1,t2,diff;
  cin >> t1.hrs >> t1.min >> t1.sec;
  cin >> t2.hrs >> t2.min >> t2.sec;
 diffTimePeriod(t1, t2, &diff);
  cout << diff.hrs << ":" << diff.min << ":" << diff.sec;
  return 0;
}
