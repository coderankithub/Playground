#include<bits/stdc++.h>
using namespace std;
int main(){
    int max_weight, flore_weight;
    cin >> max_weight;
    cin >> flore_weight;
    if(max_weight > flore_weight)
          cout << "Yes, you can enter.";
    else if(max_weight == flore_weight)
          cout << "Yes, you can enter. Kindly use a rope.";
    else cout << "Sorry, you can't enter";
      return 0;
}