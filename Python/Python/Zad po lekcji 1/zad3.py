class Person:
        def __init__(self, imie, nazwisko, wiek, zawod):
            self.imie = imie,
            self.nazwisko = nazwisko,
            self.wiek = wiek,
            self.zawod = zawod


p1 = Person('Jakub', 'Kowalski', 32, 'Stolarz')
p2 = Person('Jan', 'Babalski', 24, 'Nauczyciel')
p3 = Person('Andrzej', 'Konieczny', 45, 'Kierowca')

print(p2.imie, p2.nazwisko, p2.wiek, p2.zawod)