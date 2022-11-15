class Animal:
       def __init__(self, name, type, color):
            self.name = name
            self.type= type
            self.color = color
       def move(self):
            print(f"Pies {dog.name} rasy {dog.type} poszedł na spacer")
       def eat(self):
            print(f"Kot {cat.name} koloru {cat.type} poszedł zjeść whiskas")
       

dog = Animal('Azor', 'Shiba-inu', 'biały')
cat = Animal('Puszek', 'Brytyjski', 'niebieski')

dog.move()
cat.eat()
