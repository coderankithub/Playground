#include<iostream>
using namespace std;
struct Employee {
	char name[20], des[50];
  	int id, age;
   	float salary;
};
int main()
{
  Employee e;
 cout << "Enter name:";
 cin >> e.name;
  cout << "\nEnter ID:";
  cin >> e.id;
  cout << "\nEnter age:";
  cin >> e.age;
  cout << "\nEnter designation:";
  cin >> e.des;
  cout << "\nEnter Salary:";
  cin >> e.salary;
  cout << "\nEmployee Details\n";
  cout << "Name of the Employee : " << e.name;
  cout << "\nID of the Employee : " << e.id << endl;
  cout << "Age of the Employee : " << e.age << endl;
  cout << "Designation of the Employee : " << e.des << endl;
  cout << "Salary of the Employee : " << e.salary;
  return 0;
}