#include<bits/stdc++.h>
using namespace std;
int main(){
    int n, t = 2, cnt = 0, r = 6;
    cin >> n;
    for(int i = 1;i <= n; i ++){
        if(i == 1)
            cout << 0 << " ";
        else {
            cout << t << " ";
            t += r;
            cnt ++;
            if(cnt == 2){
                r += 4;
                cnt = 0;
            }
        }
    }
    return 0;
}