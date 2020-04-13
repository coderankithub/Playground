#include<iostream>
using namespace std;
struct Distance {
  int feet;
  float inch;
};

void distanceSum(struct Distance d1, struct Distance d2, struct Distance *ans){
	ans->feet = d1.feet + d2.feet;
  	ans->inch = d1.inch + d2.inch;
    if(ans->inch > 12){
      ans->inch = ans->inch - 12;
      ++ ans->feet;
    }
}
int main()
{
  struct Distance d1, d2, ans;
  cin >> d1.feet >> d1.inch;
  cin >> d2.feet >> d2.inch;
  distanceSum(d1, d2, &ans);
  cout << ans.feet << "\'-" << ans.inch << "\"";
  return 0;
}