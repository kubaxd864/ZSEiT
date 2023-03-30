from barman import Barman

barman = Barman()
drink = barman.createDrink("Sok ananasowy", 100, "Likier Malibu", 50, "Mleko kokosowe", 100)
barman.printDrink(drink)
