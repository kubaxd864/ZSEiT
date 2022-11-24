#include <iostream>
#include <ctime>
#include <cstdlib>

int losowanie()
{
    return(( std::rand() % 100 ) + 1 );
}

bool sprawdzanie_powtarzalnosci( int tablica[], int wylosowane, int liczba_wylosowana )
{
    int i = 0;
   
    if( wylosowane == 0 )
         return false;
   
    do
    {
        if( tablica[ i ] == liczba_wylosowana )
             return true;
       
        i++;
       
    } while( i < wylosowane );
   
    return false;
}

void wypisanie( int tablica[] )
{
    int i;
    int x = 1;
   
    for( i = 0; i < 6; i++ )
    {
        std::cout << x << " liczba: " << tablica[ i ] << std::endl;
        x++;
    }
}

int iMax( int tablica[], int rozmiar )
{
    int i = 1;
    int temp = tablica[ 0 ];
   
    do
    {
        if( tablica[ i ] > temp )
             temp = tablica[ i ];
       
        i++;
    } while( i < rozmiar );
   
    return temp;
}

int iMin( int tablica[], int rozmiar )
{
    int i = 1;
    int temp = tablica[ 0 ];
   
    do
    {
        if( tablica[ i ] < temp )
             temp = tablica[ i ];
       
        i++;
    } while( i < rozmiar );
   
    return temp;
}


int main()
{
    srand( time( NULL ) );
    int tablica[ 10 ];
    int wylosowane = 0;
    int liczba_tymczasowa;
   
    do
    {
        liczba_tymczasowa = losowanie();
       
        if( sprawdzanie_powtarzalnosci( tablica, wylosowane, liczba_tymczasowa ) == false )
        {
            tablica[ wylosowane ] = liczba_tymczasowa;
            wylosowane++;
        }
       
    } while( wylosowane < 10 );
   
    wypisanie( tablica );
    std::cout << "" << std::endl;
    std::cout << "Najwieksza liczba to: " << iMax( tablica, 10 ) << std::endl << std::endl;
    std::cout << "Najmniejsza liczba to: " << iMin( tablica, 10 ) << std::endl << std::endl;
   
    return 0;
}
