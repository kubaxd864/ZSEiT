from Client import client1, client2, client3, client4, client5
from Account import First_client_account, Second_client_account, Third_client_account, Fourth_client_account, Fifth_client_account
from Bank import bank

def run():
    global Name, Pin, selected_client, selected_account
    print("Witaj w ", bank.name)
    Name = input("Podaj Imię i Nazwisko: ")
    Pin = int(input("Podaj Numer PIN do Swojego Konta: "))
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

def menu():
    if(Name == Name == client1.name + " " + client1.surname or Name == client2.name + " " + client2.surname or Name == client3.name + " " + client3.surname or Name == client4.name + " " + client4.surname or Name == client5.name + " " + client5.surname and Pin == selected_account.accountPin):
        global choice
        print("Witaj", Name)
        print("Dostępne Operacje:")
        print("1. Dane Klienta")
        print("2. Stwórz Konto")
        print("3. Wpłata")
        print("4. Wypłata")
        print("5. Sprawdź Saldo")
        print("6. Wyjście")
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
            First_client_account.PushAccounts()
            First_client_account.CloseAccount()
            First_client_account.ViewAccounts()
            second_menu()
        elif(choice == 3):
            deposit_amount = int(input("\nPodaj Kwotę Wpłaty: "))
            selected_account.deposit(deposit_amount)
            print("Aktualnie Dostępne Środki:", selected_account.checkBalance())
            second_menu()
        elif(choice == 4):
            withdraw_amount = int(input("\nPodaj Kwotę Wypłaty: "))
            selected_account.withdraw(withdraw_amount)
            print("Dalej Dostępne Środki:", selected_account.checkBalance())
            second_menu()
        elif(choice == 5):
            print("\nDostępne Środki na Koncie:", selected_account.checkBalance())
            second_menu()
        elif(choice == 6):
            print("Wyjście")
        else:
            print("Niepoprawny Numer Operacji")

def second_menu():
    global choice
    print("\nWybierz Następną Operację:")
    print("1. Dane Klienta")
    print("2. Stwórz Konto")
    print("3. Wpłata")
    print("4. Wypłata")
    print("5. Sprawdź Saldo")
    print("6. Wyjście")
    choice = int(input("Podaj Numer Operacji: "))
    make_choice()

run()