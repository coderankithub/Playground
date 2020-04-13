#include<iostream>
using namespace std;
int main()
{
  	int m, t, w, th,f,s,su, salary  = 0;
  	cin >> su;
  	cin >> m;
  	cin >> t;
 	cin >> w;
  	cin >> th;
  	cin >> f;
  	cin >> s;
  	int tot_hrs = su+ m +t + w+ th + f + s;
	if(m > 8)
   		salary += (m*100) + (m-8)*15;
  	else salary+= (m*100);
	if(t > 8)
    	salary += (t*100) +(t-8)*15;
  	else salary+= (t*100);
 	if(w > 8) 
    	salary += (w*100) +(w-8)*15;
  else salary+= (w*100);
 	if(th > 8)
      	salary += (th*100) + (th-8)*15;
  	else salary+= (th*100);
  	if(f > 8) 
  	  	salary += (f*100) + (f-8)*15;
  else salary+= (f*100);
  	if(s != 0){
    	if(s > 8)
      		salary += (s*100)+(s-8)*15 + (s*100) / 4;
     	else  salary += (s*100) + (s*100)/4;
  	}
  else {
  	if(tot_hrs > 40)
	      salary += (tot_hrs - 40)*25;
  }
	if(su != 0){
  		if(su > 8)
    		salary += (su*100)+(su-8)*15 + (s*100) / 2;
  		else 
          salary += (su*100) + (su*100)/2;
	}
  else {
    if(tot_hrs > 40)
	      salary += (tot_hrs - 40)*25;
  }
  cout << salary;
return 0;
}