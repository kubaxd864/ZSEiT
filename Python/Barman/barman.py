from ingredient import Ingredient
from drink import Drink

class Barman:
    def createDrink(self, name1, amount1, name2, amount2, name3, amount3):
        ingredient1 = Ingredient(name1, amount1)
        ingredient2 = Ingredient(name2, amount2)
        ingredient3 = Ingredient(name3, amount3)
        return Drink(ingredient1, ingredient2, ingredient3)

    def printDrink(self, drink):
        ingredients = drink.get_ingredients()
        total_amount = sum(ingredient.get_amount() for ingredient in ingredients)
        proportions = [ingredient.get_amount() / total_amount for ingredient in ingredients]
        
        ingredients_str = ', '.join(ingredient.get_name() for ingredient in ingredients)
        proportions_str = ', '.join(f'{proportion:.2f}' for proportion in proportions)
        
        print(f"Składniki drinka to: {ingredients_str} w proporcjach {proportions_str}. Jego pojemność to {total_amount}ml")
