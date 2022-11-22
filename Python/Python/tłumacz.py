PolishWords = []
EnglishWords = []

class Word:
	def __init__(self,word):
		self.word = word
	
def Englishwords():
		p1 = Word("Access level")
		EnglishWords.append(p1)
		p2 = Word("Assets")
		EnglishWords.append(p2)
		p3 = Word("Authorization")
		EnglishWords.append(p3)
		p4 = Word("Authentication")
		EnglishWords.append(p4)
		p5 = Word("Click-through")
		EnglishWords.append(p5)
		p6 = Word("Content")
		EnglishWords.append(p6)
		p7 = Word("Confidentiality")
		EnglishWords.append(p7)
		p8 = Word("Data loading")
		EnglishWords.append(p8)

def Polishwords():
		e1 = Word("poziom dostępu")
		PolishWords.append(e1)
		e2 = Word("aktywa")
		PolishWords.append(e2)
		e3 = Word("upoważnienie")
		PolishWords.append(e3)
		e4 = Word("uwierzytelnienie ")
		PolishWords.append(e4)
		e5 = Word("klikalność")
		PolishWords.append(e5)
		e6 = Word("zawartość")
		PolishWords.append(e6)
		e7 = Word("poufność")
		PolishWords.append(e7)
		e8 = Word("ładowanie danych")
		PolishWords.append(e8)

def menu():
	a = str(input("Jaką tablicę chcesz wyświetlić Angielską czy Polską?"))
	if a == "Polską" or a == "polską":
		print(f"Słowa dostępne w tablicy:")
		a = len(PolishWords)
		for i in range(a):
			print(i+1,".",PolishWords[i].word)
	elif a == "Angielską" or a == "angielską":
		print(f"Słowa dostępne w tablicy:")
		a = len(EnglishWords)
		for i in range(a):
			print(i+1,".",EnglishWords[i].word)

def translate():
	a = str(input("Podaj słowo do przetłumaczenia:"))
	if a == "Poziom Dostępu" or a == "poziom dostępu":
			print(EnglishWords[0].word)
	elif a == "Aktywa" or a == "aktywa":
			print(PolishWords[1].word)
	elif a == "Upoważnienie" or a == "upoważnienie":
			print(PolishWords[2].word)
	elif a == "Uwierzytelnienie" or a == "uwierzytelnienie":
			print(PolishWords[3].word)
	elif a == "Klikalność" or a == "klikalność":
			print(PolishWords[4].word)
	elif a == "Zawartość" or a == "zawartość":
			print(PolishWords[5].word)
	elif a == "Poufność" or a == "poufność":
			print(PolishWords[6].word)
	elif a == "Ładowanie Danych" or a == "ładowanie danych":
			print(PolishWords[7].word)
	elif a == "Access level" or a == "access level":
			print(PolishWords[0].word)
	elif a == "Assets" or a == "assets":
			print(PolishWords[1].word)
	elif a == "Authorization" or a == "authorization":
			print(PolishWords[2].word)
	elif a == "Authentication" or a == "authentication":
			print(PolishWords[3].word)
	elif a == "Click-through" or a == "click-through":
			print(PolishWords[4].word)
	elif a == "Content" or a == "content":
			print(PolishWords[5].word)
	elif a == "Confidentiality" or a == "confidentiality":
			print(PolishWords[6].word)
	elif a == "Data loading" or a == "data loading":
			print(PolishWords[7].word)

if __name__ == "__main__":
	if True:
		Polishwords()
		Englishwords()
		menu()
		translate()