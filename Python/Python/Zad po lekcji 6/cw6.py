class Trojkat:
       def __init__(self, a, b, c):
            self.a = a
            self.b = b
            self.c = c
       def spr(self): 
            if self.a + self.b > self.c:
                print('Można zbudować')
            elif self.b + self.c > self.a:
                print('Można zbudować')
            elif self.a + self.c > self.b:
                print('Można zbudować')
            else:
               print('Nie można zbudowac')

class TrojkatRoznoboczny(Trojkat):
       def __init__(self, a, b, c, pole , obwod):
            super().__init__(a, b, c)
            self.pole = pole
            self.obwod = obwod
       def TR1_info(self):
          print(f"Pole tego trójkąta o bokach {self.a}, {self.b}, {self.c} wynosi: {self.pole}")
          print(f"Obwód tego trójkąta o bokach {self.a}, {self.b}, {self.c} wynosi: {self.obwod}")

class TrojkatProstokatny(Trojkat):
       def __init__(self, a, b, c, pole , obwod):
            super().__init__(a, b, c)
            self.pole = pole
            self.obwod = obwod
       def TP_info(self):
          print(f"Pole tego trójkąta o bokach {self.a}, {self.b}, {self.c} wynosi: {self.pole}")
          print(f"Obwód tego trójkąta o bokach {self.a}, {self.b}, {self.c} wynosi: {self.obwod}")

class TrojkatRownoboczny(Trojkat):
       def __init__(self, a, b, c, pole , obwod):
            super().__init__(a, b, c)
            self.pole = pole
            self.obwod = obwod
       def TR2_info(self):
          print(f"Pole tego trójkąta o bokach {self.a}, {self.b}, {self.c} wynosi: {self.pole}")
          print(f"Obwód tego trójkąta o bokach {self.a}, {self.b}, {self.c} wynosi: {self.obwod}")
tr = Trojkat(2, 3, 4)
tr1 = TrojkatRoznoboczny(4, 5, 6, 7.5, 15)
tr2 = TrojkatRoznoboczny(10, 8, 20, 19, 38)
tp1 = TrojkatProstokatny(6, 8, 10, 24, 24)
tp2 = TrojkatProstokatny(8, 15, 17, 60, 40)
tr3 = TrojkatRownoboczny(6, 6, 6, 15.3, 18)
tr4 = TrojkatRownoboczny(8, 8, 8, 27.2, 24)

tr1.TR1_info()
tp1.TP_info()
tr3.TR2_info()