import random

MAX_WRONG = 8
WORDS = ["JABŁKO", "KOMPUTER", "KOT", "SŁONIE", "KRAKÓW", "SAMOCHOD", "LEKCJA", "KSIĄŻKA", "DZIEŃ", "NOC", "KOSZULKA", "KOSZMAR", "KOSZ", "KOSZT", "KOSZTY"]

word = random.choice(WORDS)  
so_far = "-" * len(word)
wrong = 0
uzyte = []

print("Witaj w grze szubienica")
print("Wybierz Opcję: ")
print("1. Graj")
print("2. Wyjście")
menu = input()

if(menu == "1" or menu == "Graj" or menu == "graj"):
	while wrong < MAX_WRONG and so_far != word:
		print("Wykorzystane Litery:", uzyte)
		print("Hasło to:", so_far)

		guess = input("Podaj Literę literę: ")
		guess = guess.upper()
		
		while guess in uzyte:
			print("Już wykorzystałeś literę", guess)
			guess = input("Wprowadź literę: ")
			guess = guess.upper()

		uzyte.append(guess)

		if guess in word:
			
			new = ""
			for i in range(len(word)):
				if guess == word[i]:
					new += guess
				else:
					new += so_far[i]              
			so_far = new
		else:
			print("Podana litera nie występuje w tym słowie")
			wrong += 1


	if wrong == MAX_WRONG:
		print("Przegrałeś!")
	else:
		print("Gratulacje!")
		
	print("Hasłem było", word)
	

elif(menu == "2" or menu == "Wyjście" or menu == "wyjście"):
	print("Wyjście")