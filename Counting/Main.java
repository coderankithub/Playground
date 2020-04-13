#include<iostream>
using namespace std;
int main()
{
  string token;
  string vowel = "aeiouAEIOU",consonants  = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
  string digits = "0123456789";
  getline(cin, token);
  int v = 0, c = 0, w = 0, d = 0, s = 0;
  for(int i = 0; i< token.length(); i ++){
     if(vowel.find(token[i]) != -1)
      v ++;
    else if(consonants.find(token[i]) != -1)
      c ++;
    else if(digits.find(token[i]) != -1)
      d ++;
    else if(token[i] == ' ')
      w ++;      	
    else s ++;
  }
  cout << "Vowels:" <<  v << '\n';
  cout << "Consonants:" <<  c << '\n';
   cout << "White Spaces:" << w << '\n';
  cout << "Digits:" << d<< '\n';
  cout << "Symbols:" << s << '\n';
  return 0;
}