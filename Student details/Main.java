#include<iostream>
#include<algorithm>
using namespace std;
struct Student {
  char name[30];
  char department[20];
  int yearOfStudy =0;
  float cgpa = 0.0;
};
bool compareTwoStudents(Student a, Student b)
{
     if(a.name < b.name)
       return 1;
  return 0;
}
int main()
{
  cout << "Enter the number of students\n";
  int n;
  cin >> n;
   Student s[n];
  for(int i = 0; i < n;i ++){
    cout << "Enter the details of student " << i+1 << "\n";
  	cout << "Enter name\n";
    cin >> s[i].name;
    cin.ignore();
    cout << "Enter department\n";
    cin >> s[i].department;
    cin.ignore();
    cout << "Enter year of study\n";
    cin >> s[i].yearOfStudy;
    cout << "Enter cgpa\n";
    cin >> s[i].cgpa;
  }
  sort(s, s+n, compareTwoStudents);
   cout <<"Details of students";

  for(int i = 0; i < n; i ++){
    cout << "\nStudent " << i+1 << '\n';
    cout << "Name:" << s[i].name;
    cout << "\nDepartment:"<< s[i].department;
    cout <<"\nYear of study:" << s[i].yearOfStudy;
    cout << "\nCGPA:" << s[i].cgpa;
  }
  return 0;
}
