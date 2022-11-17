class Restaurant:
    def __init__(self, restaurant_name, cuisine_type):
        self.restaurant_name = restaurant_name 
        self.cuisine_type = cuisine_type
    def describe_restaurant(self):
        print(f"Nazwa restauracji to: " + self.restaurant_name)
        print(f"Typ kuchni: " + self.cuisine_type)
    def open_restaurant(self):
        print(f"Restauracja otwarta w godzinach od 8.00 do 16.00")

class IceCreamStand(Restaurant):
       def __init__(self, restaurant_name, cuisine_type, flavors):
            super().__init__(restaurant_name, cuisine_type)
            self.flavors = flavors
       def show_flavors(self):
           print(f"Dostępne smaki lodów to: " + self.flavors)

r1 = Restaurant("Kawiarnia u Zygmunta", "Kawa")
i1 = IceCreamStand("Lodziarnia u Małgosi","Lody", "Truskawkowe")

r1.describe_restaurant()
r1.open_restaurant()
i1.show_flavors()

