class Bank:
    def __init__(self, name):
        self.name = name
        self.accountsNumbers = []
        self.accountsPins = []

    def createAccount(self, account):
        self.accountsNumbers.append(account)

    def closeAccount(self, account):
        self.accountsNumbers.remove(account)

    def viewAccounts(self):
        for account in self.accountsNumbers:
            print(account.getAccountNumber())

bank = Bank("Good Bank")