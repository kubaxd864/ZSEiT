#include <iostream>

using namespace std;

int wyplata;
int podatek;
cout << "Podaj kwotę wynagrodzenia: ";
cin >> wyplata;

if(kwota > 7200)
    podatek = wyplata*0,34;
    cout << "Podatek wynosi 34% a jego kwota to:" << podatek;
else if(kwota < 7200)
    podatek = wyplata*0,28;
    cout << "Podatek to 28% a jego kwota to:" << podatek;

return 0;