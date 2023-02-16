from Person import Person

class Client(Person):
    def __init__(self, clientID, name, surname, gender, age, phonenumber, address):
        super().__init__(name, surname, gender, age, phonenumber, address)
        self.clientID = clientID
        self.Clients = []

    def PushClients(self):
        self.Clients.extend([client1, client2, client3, client4, client5]) 
    
    def ViewClients(self):
        print("Lista Klientów:")
        for x in self.Clients:
            print(x.name + " " + x.surname)
    
    def AddClient(self):
        self.id = len(self.Clients) + 1
        name = input("Podaj Imię nowego Klienta: ")
        surname = input("Podaj Nazwisko nowego Klienta: ")
        gender = input("Podaj Płeć nowego Klienta: ")
        age = int(input("Podaj Wiek nowego Klienta: "))
        phonenumber = input("Podaj Numer Telefonu nowego Klienta: ")
        address = input("Podaj Adres Zamieszkania nowego Klienta: ")
        client = Client(self.id, name, surname, gender, age, phonenumber, address)
        self.Clients.append(client)
    
    def DeleteClient(self):
        ClientToDelete = input("Podaj Imię i Nazwisko Klienta do Usunięcia: ")
        for client in self.Clients:
            if(client.name + " " + client.surname == ClientToDelete):
                self.Clients.remove(client)
                print("Klient " + ClientToDelete + " Został Usunięty")
                break
            else:
                print("Brak Takiego Klienta w Bazie")

client1 = Client(1, "Jacek", "Łoś", "M", 25, "355456789", "ul. Miodowa 12")
client2 = Client(2, "Anna", "Kowalska", "F", 23, "355234689", "ul. Malińska 28")
client3 = Client(3, "Paweł", "Jumper", "M", 38, "355412376", "ul. Raymonta 36")
client4 = Client(4, "Hanna", "Mostowiak", "F", 55, "123122224", "ul. Akacjowa 1")
client5 = Client(5, "Łukasz", "Dzik", "M", 19, "355456789", "ul. Złota 10")