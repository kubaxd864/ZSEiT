# W powyższym przykładzie klasa Animal jest abstrakcyjną klasą bazową dla klas Dog i Cat, 
# które reprezentują konkretne zwierzęta. Klasa AnimalFactory służy do tworzenia obiektów zwierząt na podstawie podanego typu. 
# Dzięki temu możemy tworzyć różne rodzaje zwierząt bez konieczności określania ich dokładnych klas.

class Animal:
    def __init__(self, name):
        self._name = name

    def speak(self):
        raise NotImplementedError("Subclass must implement this method")

class Dog(Animal):
    def speak(self):
        return "Woof!"

class Cat(Animal):
    def speak(self):
        return "Meow!"

class AnimalFactory:
    def create_animal(self, animal_type):
        if animal_type == "Dog":
            return Dog(animal_type)
        elif animal_type == "Cat":
            return Cat(animal_type)
        else:
            raise ValueError("Invalid animal type")

# Użycie fabryki
factory = AnimalFactory()
animal = factory.create_animal("Dog")
print(animal.speak()) 