#include <iostream>
#include<cstring>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
  char n[50];
  int r;
  float m;
   cin.getline(n, 50);
   cin >> r;
   cin >> m;
   student s1;
  strcpy(s1.name, n);
  s1.roll = r;
  s1.marks = m;
  cout << '\n';
  cout << "Student Details\n";
  cout <<"Name: " << s1.name;
  cout <<"\nRoll: "<< s1.roll;
  cout << "\nMarks: "<< s1.marks;
    return 0;
}