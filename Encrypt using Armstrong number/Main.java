#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
	int digits, ans = 0,k = n;
  	while(n > 0){
      digits ++;
      n /= 10;
    }
  n = k;
  	while(n >0){
      ans += power(n%10, digits);
      n /= 10;
    }
  return ans == k;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}