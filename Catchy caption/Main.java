#include <cstring>
#include <iostream>
int main()
{
  char caption[100];
  std:: cin >> caption;
  std:: cin.getline(caption,100);
   int cnt = 0;
   for(int i = 0; i < strlen(caption); i++){
     if(caption[i] == ' ')
       	cnt ++;
   }
  if(cnt <= 10)
   std:: cout << "Caption eligible for the contest";
  else 
    std:: cout << "Caption not eligible for the contest";
	return 0;
}