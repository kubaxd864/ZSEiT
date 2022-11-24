#include <cstdlib>
#include <iostream>
#include <time.h>

using namespace std;

int main()
{
    srand( (unsigned)time( NULL ) );
    int liczba, los, max,i=0;
    cout<<"Podaj zakres : 0-";
    cin>>max;
    los=rand() % max;
    do{
               cout<<"Podaj swoja liczbe:";
               cin>>liczba;
               if(liczba>los) 
			   cout<<"Twoja liczba jest za duza.\n";
               if(liczba<los) 
			   cout<<"Twoja liczba jest za mala.\n";
               if(i == 2)
			   return 0;
               if(liczba==los) 
			   cout<<"Brawo ! Zgadles ! Moja liczba to "<<los<<endl;
               ++i;
               }
               while(liczba!=los);
    cout<<"Udalo Ci sie za "<<i<<" razem."<<endl;
    system("PAUSE");
    return EXIT_SUCCESS;
}
