class Sortowanie:
        
    elements = [4, 2]
    size = len(elements)

def add_element():
    print("Podaj elementy do tablicy: ")
    for i in range(3):
        a = (int(input()))
        Sortowanie.elements.append(a)


def show_after():
    print("Tablica po sortowaniu: ", Sortowanie.elements)

def sortowanie():
    for i in range(Sortowanie.size):
        for j in range(0, Sortowanie.size-i-1):
            if Sortowanie.elements[j] > Sortowanie.elements[j+1]:
                Sortowanie.elements[j], Sortowanie.elements[j+1] = Sortowanie.elements[j+1], Sortowanie.elements[j]
                print(Sortowanie.elements)

if __name__ == "__main__":
	if True:
	    add_element()

if __name__ == "__main__":
	if True:
	    sortowanie()
if __name__ == "__main__":
	if True:
	    show_after()
            


