#include <iostream>
int main()
{
char str[100], rev[100];     
int count = 0, end , i;    
  std:: cin.getline(str,100);
  for(int i = 0; str[i] != '\0'; i++)
    count ++;  
    end = count;
  
    for(i = 0; i < count; i ++){
	rev[i] = str[--end];     
    }
  rev[i] = '\0';
std::cout<<rev;
}