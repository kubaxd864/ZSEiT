class BankAccount:
    def __init__(self, accountNumber, balance):
        self.accountNumber = accountNumber
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