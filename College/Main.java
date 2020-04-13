#include<iostream>
#include<algorithm>
using namespace std;
struct  College{
  char name[100];
  char city[20];
  int yearOfest =0;
  float passPer = 0.0;
};
bool compareTwoStudents(College a, College b)
{
     if(a.name > b.name)
       return 1;
  return 0;
}
int main()
{
  cout << "Enter the number of colleges\n";
  int n;
  cin >> n;
   College s[n];
  for(int i = 0; i < n;i ++){
    cout << "Enter the details of college " << i+1 << "\n";
  	cout << "Enter name\n";
    cin >> s[i].name;
    cin.ignore();
    cout << "Enter city\n";
    cin >> s[i].city;
    cin.ignore();
    cout << "Enter year of establishment\n";
    cin >> s[i].yearOfest;
    cout << "Enter pass percentage\n";
    cin >> s[i].passPer;
  }
  sort(s, s+n, compareTwoStudents);
   cout <<"Details of colleges";

  for(int i = 0; i < n; i ++){
    cout << "\nCollege:" << i+1 << '\n';
    cout << "Name:" << s[i].name;
    cout << "\nCity:"<< s[i].city;
    cout <<"\nYear of establishment:" << s[i].yearOfest;
    cout << "\nPass percentage:" << s[i].passPer;
  }
  return 0;
}
