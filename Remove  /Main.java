#include<iostream>
using namespace std;
int main()
{
  string sentence, remove = "the";
  getline(cin, sentence);
  while(sentence.find(remove) != -1){
  	int i = sentence.find(remove);
    sentence.replace(i, 4, "");
  }
  cout << sentence;
  return 0;
}