from Person import Person

class Client(Person):
    def __init__(self, clientID, name, surname, gender, age, phonenumber, address):
        super().__init__(name, surname, gender, age, phonenumber, address)
        self.clientID = clientID

client1 = Client(1, "Jacek", "Łoś", "M", 25, "355456789", "ul. Miodowa 12")
client2 = Client(2, "Anna", "Kowalska", "F", 23, "355234689", "ul. Malińska 28")
client3 = Client(3, "Paweł", "Jumper", "M", 38, "355412376", "ul. Raymonta 36")
client4 = Client(4, "Hanna", "Mostowiak", "F", 55, "123122224", "ul. Akacjowa 1")
client5 = Client(5, "Łukasz", "Dzik", "M", 19, "355456789", "ul. Złota 10")