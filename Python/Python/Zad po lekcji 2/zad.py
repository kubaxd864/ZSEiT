class Employee:
       def __init__(self, imie, nazwisko, email, wynagrodzenie):
            Employee_count = 0
            self.imie = imie
            self.nazwisko = nazwisko
            self.email = email
            self.wynagrodzenie = wynagrodzenie
            Employee_count += 1
       def get_annual_salary(self):
            wr = self.wynagrodzenie*12
            print(f"Wynagrodzenie roczne wynosi: {wr}")
       def show_employee_information(self):
          full_name = self.imie + self.nazwisko
          print(f"Pracownik: {full_name}, adres e-mail {self.email}, wynagrodzenie miesięczne {self.wynagrodzenie}")
       

p1 = Employee('Jakub', 'Kowalski', 'jakub@gmail.com', 4500)

p1.show_employee_information()
p1.get_annual_salary()
