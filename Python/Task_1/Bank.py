# Inicjalizacja klasy Bank
#
# Klasa przechowuje informacje o numerach kont w banku i pinach do tych kont
# Klasa posiada metody:
# - createAccount - tworzy nowe konto w banku
# - closeAccount - usuwa konto z banku
# - viewAccounts - wyświetla wszystkie konta w banku
#

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