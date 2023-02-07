from Bank import Bank
from Account import BankAccount
from Person import Person
from Client import Client
from random import randint

def run():
    bank = Bank("Good Bank")
    account = BankAccount("1234567890", 1000)
    person = Person("Jan", "Kowalski", "M", 25, "123456789", "ul. Kowalska 1")
    bank.createAccount(account)

    print("Witaj w ", bank.name)
    Name = input("Podaj Imię i Nazwisko: ")
    if(Name == person.name + " " + person.surname):
        print("Witaj", person.name)
        print("Dostępne Operacje:")
        print("1. Dane Klienta")
        print("2. Stwórz Konto")
        print("3. Wpłata")
        print("4. Wypłata")
        print("5. Sprawdź Saldo")
        print("6. Wyjście")
        choice = int(input("Podaj Numer Operacji: "))
        if(choice == 1):
            print("Dane Klienta:")
            print(person.Person_info())
        elif(choice == 2):
            first_part = randint(1000, 9999)
            second_part = randint(1000, 9999)
            third_part = randint(1000, 9999)
            fourth_part = randint(1000, 9999)
            pin = randint(1000, 9999)
            account_number = str(first_part) + " " + str(second_part) + " " + str(third_part) + " " + str(fourth_part)
            print("Numer Twojego Konta:", account_number)
            print("Twój Numer PIN:", pin)
        elif(choice == 3):
            deposit_amount = int(input("Podaj Kwotę Wpłaty: "))
            account.deposit(deposit_amount)
            print("Aktualnie Dostępne Środki:", account.checkBalance())
        elif(choice == 4):
            withdraw_amount = int(input("Podaj Kwotę Wypłaty: "))
            account.withdraw(withdraw_amount)
            print("Dalej Dostępne Środki:", account.checkBalance())
        elif(choice == 5):
            print("Dostępne Środki na Koncie:", account.checkBalance())
        elif(choice == 6):
            print("Wyjście")
        else:
            print("Niepoprawny Numer Operacji")
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

run()