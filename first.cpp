#include<iostream>
using namespace std;

int main() {
char a;
cin>>a;
int i;
if (a <= 'a' && a >= 'z') {
  cout << "0";
return 0;
} 
else if (a <= 'A' && a >= 'Z') {
  cout << "1";
  return 0;
} else {
  cout << "-1";
  return 0;
}
}

