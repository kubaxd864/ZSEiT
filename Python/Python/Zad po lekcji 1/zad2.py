class Person:
        def __init__(self, imie):
            self.imie = imie
        def przedstaw_sie(self):
            print(f"Cześć jestem {self.imie}")

p1 = Person('Jakub')

p1.przedstaw_sie()