class Bank:
    def __init__(self, name):
        self.name = name
        self.accountsNumbers = []
        self.accountsPins = []

    def createAccount(self, account, pin):
        self.accountsNumbers.append(account)
        self.accountsPins.append(pin)

    def closeAccount(self, account, pin):
        self.accountsNumbers.remove(account)
        self.accountsPins.remove(pin)

    def viewAccounts(self):
        print(self.accountsNumbers)

bank = Bank("Good Bank")