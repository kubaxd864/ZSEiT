class Ingredient:
    def __init__(self, name, amount):
        self.name = name
        self.amount = amount
 
class Drink:
    def __init__(self, ingredients, capacity):
        self.ingredients = ingredients
        self.capacity = capacity
 
class Barman:
    def createDrink(self, name1, amount1, name2, amount2, name3, amount3):
        total_amount = amount1 + amount2 + amount3
        ings = [Ingredient(name1, amount1), Ingredient(name2, amount2), Ingredient(name3, amount3)]
        return Drink(ings, total_amount)
 
    def printDrink(self, drink):
        ings_names = ', '.join([ingredient.name for ingredient in drink.ingredients])
        prop = ', '.join([str(round(ingredient.amount / drink.capacity, 2)) for ingredient in drink.ingredients])
        print(f"Składniki drinka to: {ings_names} w proporcjach {prop}. Jego pojemność to {drink.capacity}ml")
 

barman = Barman()
drink = barman.createDrink("Sok ananasowy", 100, "Likier malibu", 50, "Mleczko kokosowe", 100)
barman.printDrink(drink)