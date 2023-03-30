# W powyższym przykładzie klasa Mediator jest abstrakcyjną klasą bazową dla klasy ConcreteMediator, 
# która implementuje interfejs komunikacji między klasami Colleague. Klasy Colleague reprezentują obiekty, 
# które mogą wymieniać się wiadomościami za pośrednictwem mediatora. Dzięki temu obiekty Colleague nie muszą się bezpośrednio komunikować między sobą, 
# co zapewnia lepszą modularność kodu. Wzorzec Mediator stosujemy gdy zmiana jakichś klas jest trudna z powodu ścisłego sprzęgnięcia z innymi klasami.

class Mediator:
    def send(self, sender, message):
        raise NotImplementedError("Subclass must implement this method")

class ConcreteMediator(Mediator):
    def send(self, sender, message):
        print(f"{sender}: {message}")

class Colleague:
    def __init__(self, mediator):
        self._mediator = mediator

class ConcreteColleague1(Colleague):
    def send(self, message):
        self._mediator.send(self, message)

class ConcreteColleague2(Colleague):
    def send(self, message):
        self._mediator.send(self, message)

# Użycie mediatora
mediator = ConcreteMediator()
colleague1 = ConcreteColleague1(mediator)
colleague2 = ConcreteColleague2(mediator)

colleague1.send("Message from Colleague 1")
colleague2.send("Message from Colleague 2")