PolishWords = ["Poziom dostępu", "Aktywa", "Upoważnienie", "Uwierzytelnienie", "Klikalność", "Zawartość", "Poufność", "Ładowanie danych"]
EnglishWords = ["Access level", "Assets", "Authorization", "Authentication", "Click-through", "Content", "Confidentiality", "Data loading"]

class Word:
	def __init__(self,word):
		self.word = word

def menu():
	a = str(input("Jaką tablicę chcesz wyświetlić Angielską czy Polską?"))
	if a == "Polską" or a == "polską":
		print(f"Słowa dostępne w tablicy:")
		a = len(PolishWords)
		for i in range(a):
			print(i+1,".",PolishWords[i])
	elif a == "Angielską" or a == "angielską":
		print(f"Słowa dostępne w tablicy:")
		a = len(EnglishWords)
		for i in range(a):
			print(i+1,".",EnglishWords[i])

def translate():
	a = str(input("Podaj słowo do przetłumaczenia:"))
	if a == PolishWords[0] or a == PolishWords[0].lower():
		print(EnglishWords[0])
	elif a == PolishWords[1] or a == PolishWords[1].lower():
		print(EnglishWords[1])
	elif a == PolishWords[2] or a == PolishWords[2].lower():
		print(EnglishWords[2])
	elif a == PolishWords[3] or a == PolishWords[3].lower():
		print(EnglishWords[3])
	elif a == PolishWords[4] or a == PolishWords[4].lower():
		print(EnglishWords[4])
	elif a == PolishWords[5] or a == PolishWords[5].lower():
		print(EnglishWords[5])
	elif a == PolishWords[6] or a == PolishWords[6].lower():
		print(EnglishWords[6])
	elif a == PolishWords[7] or a == PolishWords[7].lower():
		print(EnglishWords[7])
	elif a == EnglishWords[0] or a == EnglishWords[0].lower():
		print(PolishWords[0])
	elif a == EnglishWords[1] or a == EnglishWords[1].lower():
		print(PolishWords[1])
	elif a == EnglishWords[2] or a == EnglishWords[2].lower():
		print(PolishWords[2])
	elif a == EnglishWords[3] or a == EnglishWords[3].lower():
		print(PolishWords[3])
	elif a == EnglishWords[4] or a == EnglishWords[4].lower():
		print(PolishWords[4])
	elif a == EnglishWords[5] or a == EnglishWords[5].lower():
		print(PolishWords[5])
	elif a == EnglishWords[6] or a == EnglishWords[6].lower():
		print(PolishWords[6])
	elif a == EnglishWords[7] or a == EnglishWords[7].lower():
		print(PolishWords[7])
	else:
		print("Nie znaleziono podanego słowa")

menu()
translate()