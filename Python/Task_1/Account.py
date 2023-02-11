class BankAccount:
    def __init__(self, accountID, accountNumber, accountPin, balance):
        self.accountID = accountID
        self.accountNumber = accountNumber
        self.accountPin = accountPin
        self.balance = balance

    def deposit(self, amount):
        self.balance += amount

    def withdraw(self, amount):
        if amount > self.balance:
            print("Zbyt mało środków na koncie")
        else:
            self.balance -= amount

    def checkBalance(self):
        return self.balance

    def getAccountNumber(self):
        return self.accountNumber

First_client_account = BankAccount(1, "1234 5678 9012 3453", "1234", 1500)
Second_client_account = BankAccount(2,"0987 6543 2113 3456", "3342", 2000)
Third_client_account = BankAccount(3, "1234 0990 3451 1231", "2137", 5500)
Fourth_client_account = BankAccount(4, "6634 2321 0000 2322", "7012", 44000)
Fifth_client_account = BankAccount(5, "0011 3242 4576 5533", "5561", 100)