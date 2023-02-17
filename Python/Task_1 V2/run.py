# Inicjalizacja klasy Run
#
# Importuje klasy oraz zmienne z plików Client.py, Account.py i Bank.py
# Klasa Run posiada funkcje:
# - run - uruchamia program
# - menu - wyświetla menu programu
# - second_menu - wyświetla menu po wykonaniu operacji
#
# Klasa Run posiada zmienne:
# - Name - przechowuje imię i nazwisko klienta który chce się zalogować
# - Pin - przechowuje pin do konta klienta który chce się zalogować
# - selected_client - przechowuje wybranego klienta
# - selected_account - przechowuje wybrane konto klienta
#

from Client import client1, client2, client3, client4, client5
from Account import First_client_account, Second_client_account, Third_client_account, Fourth_client_account, Fifth_client_account
from Bank import bank

def run():
    global Name, selected_client, selected_account
    print("Witaj w ", bank.name)
    Name = input("Podaj Imię i Nazwisko: ")
    if(Name ==  client1.name + " " + client1.surname):
        selected_client = client1
        selected_account = First_client_account
        menu()
    elif(Name == client2.name + " " + client2.surname):
        selected_client = client2
        selected_account = Second_client_account
        menu()
    elif(Name == client3.name + " " + client3.surname):
        selected_client = client3
        selected_account = Third_client_account
        menu()
    elif(Name == client4.name + " " + client4.surname):
        selected_client = client4
        selected_account = Fourth_client_account
        menu()
    elif(Name == client5.name + " " + client5.surname):
        selected_client = client5
        selected_account = Fifth_client_account
        menu()

def push():
    client1.PushClients()
    First_client_account.PushAccounts()

def menu():
    if(Name == Name == client1.name + " " + client1.surname or Name == client2.name + " " + client2.surname or Name == client3.name + " " + client3.surname or Name == client4.name + " " + client4.surname or Name == client5.name + " " + client5.surname):
        global choice
        print("Witaj", Name)
        print("Dostępne Operacje:")
        print("1. Dane Klienta")
        print("2. Dodaj Klienta")
        print("3. Stwórz Konto")
        print("4. Wpłata")
        print("5. Wypłata")
        print("6. Sprawdź Saldo")
        print("7. Lista Wszystkich Klientów w Bazie")
        print("8. Lista Wszystkich Kont w Bazie")
        print("9. Wyjście")
        choice = int(input("Podaj Numer Operacji: "))
        make_choice()
    else:
        print("Niepoprawne dane Klienta")
        print("1. Spróbuj ponownie")
        print("2. Wyjście")
        choice = int(input("Podaj Numer Operacji: "))
        if(choice == 1):
            run()
        elif(choice == 2):
            print("Wyjście")
        else:
            print("Niepoprawny Numer Operacji")

def make_choice():
        if(choice == 1):
            print("\nDane Klienta:")
            print(selected_client.Person_info())
            second_menu()
        elif(choice == 2):
            selected_client.AddClient()
            second_menu()
        elif(choice == 3):
            selected_account.CreateAccount()
            second_menu()
        elif(choice == 4):
            deposit_amount = int(input("\nPodaj Kwotę Wpłaty: "))
            selected_account.deposit(deposit_amount)
            print("Aktualnie Dostępne Środki:", selected_account.checkBalance())
            second_menu()
        elif(choice == 5):
            withdraw_amount = int(input("\nPodaj Kwotę Wypłaty: "))
            selected_account.withdraw(withdraw_amount)
            print("Dalej Dostępne Środki:", selected_account.checkBalance())
            second_menu()
        elif(choice == 6):
            print("\nDostępne Środki na Koncie:", selected_account.checkBalance())
            second_menu()
        elif(choice == 7):
            selected_client.ViewClients()
            second_menu()
        elif(choice == 8):
            selected_account.ViewAccounts()
            second_menu()
        elif(choice == 9):
            print("Wyjście")
        else:
            print("Niepoprawny Numer Operacji")

def second_menu():
    global choice
    print("\nWybierz Następną Operację:")
    print("1. Dane Klienta")
    print("2. Dodaj Klienta")
    print("3. Stwórz Konto")
    print("4. Wpłata")
    print("5. Wypłata")
    print("6. Sprawdź Saldo")
    print("7. Lista Wszystkich Klientów w Bazie")
    print("8. Lista Wszystkich Kont w Bazie")
    print("9. Wyjście")
    choice = int(input("Podaj Numer Operacji: "))
    make_choice()
    
push()
run()