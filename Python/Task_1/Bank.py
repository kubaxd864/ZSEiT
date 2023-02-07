class Bank:
    def __init__(self, name):
        self.name = name
        self.accounts = []

    def createAccount(self, account):
        self.accounts.append(account)

    def closeAccount(self, account):
        self.accounts.remove(account)

    def viewAccounts(self):
        for account in self.accounts:
            print(account.getAccountNumber())