#include <iostream>
using namespace std;

int main()
{
start:
  int first_number, second_number, attempt;

  while (true)
  {
    cout << "Enter two integers: ";
    cin >> first_number >> second_number;

    // Printing sum along with the userinput
    cout << first_number << " + " << second_number << " = " << first_number + second_number << endl;
    cout << "Press 1 if you want to check another number:\t";
    cin >> attempt;
    if (attempt == 1)
    {
      goto start;
    }
    else
    {
      break;
    }
  }
  return 0;
}
