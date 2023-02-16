from random import randint

class BankAccount:
    def __init__(self, accountID, accountNumber, accountPin, balance):
        self.accountID = accountID
        self.accountNumber = accountNumber
        self.accountPin = accountPin
        self.balance = balance
        self.Accounts = []

    def PushAccounts(self):
        self.Accounts.extend([First_client_account, Second_client_account, Third_client_account, Fourth_client_account, Fifth_client_account])

    def deposit(self, amount):
        self.balance += amount

    def withdraw(self, amount):
        if amount > self.balance:
            print("Zbyt mało środków na koncie")
        else:
            self.balance -= amount

    def checkBalance(self):
        return self.balance

    def CreateAccount(self):
        accountId = len(self.Accounts) + 1
        first_part = randint(1000, 9999)
        second_part = randint(1000, 9999)
        third_part = randint(1000, 9999)
        fourth_part = randint(1000, 9999)
        pin = randint(1000, 9999)
        account_number = str(first_part) + " " + str(second_part) + " " + str(third_part) + " " + str(fourth_part)
        prefix = "Client_Account_"
        name = prefix + str(accountId)
        new_account_amount = int(input("Podaj kwotę wpłaty: "))
        name = BankAccount(accountId, account_number, pin, new_account_amount)
        self.Accounts.append(name)

    def CloseAccount(self):
        AccountNumberToDelete = input("Podaj Numer Konta Do Które Chcesz Usunąć: ")
        PinToAccountToDelete = input("Podaj Kod PIN Do Które Chcesz Usunąć: ")
        for s in self.Accounts:
            if(s.accountNumber == AccountNumberToDelete and s.accountPin == PinToAccountToDelete):
                self.Accounts.remove(s)
                print("Konto Nr " + AccountNumberToDelete +" Usunięte!")
            else:
                print("Nie ma takiego Konta w Bazie !")

    def ViewAccounts(self):
        print("Lista Kont:")
        for x in self.Accounts:
            print("Konto nr: " + str(x.accountID) + " Numer Konta: " + str(x.accountNumber) + " Kod PIN: " + str(x.accountPin))

First_client_account = BankAccount(1, "1234 5678 9012 3453", "1234", 1500)
Second_client_account = BankAccount(2, "0987 6543 2113 3456", "3342", 2000)
Third_client_account = BankAccount(3, "1234 0990 3451 1231", "2137", 5500)
Fourth_client_account = BankAccount(4, "6634 2321 0000 2322", "7012", 44000)
Fifth_client_account = BankAccount(5, "0011 3242 4576 5533", "5561", 100)