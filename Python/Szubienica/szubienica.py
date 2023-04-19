import random

class Szubienica:
    
    MAX_WRONG = 8
    WORDS = ["JABŁKO", "KOMPUTER", "KOT", "SŁONIE", "KRAKÓW", "SAMOCHOD", "LEKCJA", "KSIĄŻKA", "DZIEŃ", "NOC", "KOSZULKA", "KOSZMAR", "KOSZ", "KOSZT", "KOSZTY"]
    
    def __init__(self):
        self.word = random.choice(self.WORDS)
        self.so_far = "-" * len(self.word)
        self.wrong = 0
        self.uzyte = []
        
    def menu(self):
        print("Witaj w grze szubienica")
        print("Wybierz Opcję: ")
        print("1. Graj")
        print("2. Wyjście")
        self.menu_value = input() 
        szubienica.play()
        
        
    def play(self):
        if(self.menu_value == "1" or self.menu_value == "Graj" or self.menu_value == "graj"):
            while self.wrong < self.MAX_WRONG and self.so_far != self.word:
                print("Wykorzystane Litery:", self.uzyte)
                print("Hasło to:", self.so_far)

                guess = input("Podaj Literę literę: ")
                guess = guess.upper()

                while guess in self.uzyte:
                    print("Już wykorzystałeś literę", guess)
                    guess = input("Wprowadź literę: ")
                    guess = guess.upper()

                self.uzyte.append(guess)

                if guess in self.word:

                    new = ""
                    for i in range(len(self.word)):
                        if guess == self.word[i]:
                            new += guess
                        else:
                            new += self.so_far[i]              
                    self.so_far = new
                else:
                    print("Podana litera nie występuje w tym słowie")
                    self.wrong += 1


            if self.wrong == self.MAX_WRONG:
                print("Przegrałeś!")
            else:
                print("Gratulacje!")

            print("Hasłem było", self.word)

        elif(self.menu_value == "2" or self.menu_value == "Wyjście" or self.menu_value == "wyjście"):
            print("Wyjście")
        else:
            print("Nie ma takiej opcji")
            szubienica.play()

szubienica = Szubienica()
szubienica.menu()