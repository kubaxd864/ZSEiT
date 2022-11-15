class book:
       def __init__(self, tytuł, strony, autor, data_wydania, właściciel):
            self.tytul = tytuł
            self.strony = strony
            self.autor = autor
            self.data_wydania = data_wydania
            self.właściciel = właściciel
       def get_book_info(self):
            print(f"Tytuł: {self.tytul}, Strony: {self.strony}, Autor: {self.autor}, Data Wydania: {self.data_wydania}, Właściciel: {self.właściciel}")
       def change_book_owner(self, new):
            self.właściciel = new
       
k1 = book('Wyścig', '50', 'Martin Jenny', '24.08.2011', 'Jan Kowalski')
k2 = book('Legenda. Rebeliant', '58', 'Janek Dzban', '14.08.2013', 'Andrzej Kowalski')
k3 = book('7 nawyków skutecznego nastolatka', '100', 'Lu Marie', '24.08.2012', 'Anna Kowalski')
k4 = book('Absolutnie prawdziwy pamiętnik', '72', 'Covey Sean', '24.08.2015', 'Janusz Kowalski')
k5 = book('Wyścig', '69', 'Sherman Alexie', '24.10.2011', 'Grażyna Kowalski')

lista = [k1, k2, k3, k4, k5]

k1.get_book_info()