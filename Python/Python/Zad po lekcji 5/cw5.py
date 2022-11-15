
class Vehicle:
       def __init__(self, marka, model, silnik):
            self.marka = marka
            self.model = model
            self.silnik = silnik
       def info(self):
            print(f"Marka: {self.marka}, Model: {self.model}, Silnik: {self.silnik}")

class LandVehicle(Vehicle):
       def __init__(self, marka, model, silnik, cena):
            super().__init__(marka, model, silnik)
            self.cena = cena
       def Land_info(self):
          print(f"Marka: {self.marka}, Model: {self.model}, Silnik: {self.silnik}, Cena: {self.cena}")

class AirVehicle(Vehicle):
       def __init__(self, marka, model, silnik, zasięg):
            super().__init__(marka, model, silnik)
            self.zasięg = zasięg
       def Air_info(self):
            print(f"Marka: {self.marka}, Model: {self.model}, Silnik: {self.silnik}, Cena: {self.zasięg}")

class WaterVehicle(Vehicle):
       def __init__(self, marka, model, silnik, wypornosc):
            super().__init__(marka, model, silnik)
            self.wypornosc = wypornosc
       def Water_info(self):
            print(f"Marka: {self.marka}, Model: {self.model}, Silnik: {self.silnik}, Cena: {self.wypornosc}")
l0 = Vehicle("Opel", "Corsa", "Za Mały")
l1 = LandVehicle("Toyota", "Supra", "2JZ No SHIT", "350 000")
l2 = LandVehicle("Subaru", "Impreza STI", "EJ20", "50 000")
a1 = AirVehicle("Gulfstream", "G550", "Odrzutowy", "10000km")
a2 = AirVehicle("Robinson", "R44", "Śmigłowy", "2000km")
w1 = WaterVehicle("RMS", "Titanic", "dwie czterocylindrowe maszyny parowe potrójnego rozprężania, niskoobrotowa turbina na parę odlotową", "45000t")
w2 = WaterVehicle("RMS", "Olimpic", "dwie czterocylindrowe maszyny parowe potrójnego rozprężania, niskoobrotowa turbina na parę odlotową", "45 324t")

l1.Land_info()
a1.Air_info()
w1.Water_info()