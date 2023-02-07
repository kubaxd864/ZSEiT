from Person import Person
from run import run

class Client(Person):
    def __init__(self, clientID, Account, name, surname, gender, age, phonenumber, address):
        super.__init__(name, surname, gender, age, phonenumber, address)
        self.clientID = clientID
        self.Account = Account
        self.accountsNumbers = []
        self.accountsPins = []
    
    def addAccount(self, accountNumber):
        self.accountsNumbers.append(accountNumber)
        self.accountsPins.append()
    
    def getClientAccounts(self):
        return self.Moreaccounts

client1 = Client(1, 123456789, "Jan", "Kowalski", "M", 20, "123456789", "ul. Kowalska 1")
