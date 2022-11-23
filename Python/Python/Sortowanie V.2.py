class Sortowanie:
    def __init__(self, lista):
        self.lista = lista
    
    def znajdz_max(self):
        max = self.lista[0]
        for liczba in self.lista:
            if liczba > max:
                max = liczba
        return max
    def sortuj(self):
        lista = self.lista
        lista2 = []
        for i in range(len(lista)):
            max = self.znajdz_max()
            lista2.append(max)
            lista.remove(max)
        return lista2
lista = []
for i in range(10):
    liczba = int(input("Podaj liczbę"))
    lista.append(liczba)
sort = Sortowanie(lista)
print(sort.sortuj())
