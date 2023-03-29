from ingredient import Ingredient

class Drink:
    def __init__(self, ingredient1, ingredient2, ingredient3):
        self.__ingredients = [ingredient1, ingredient2, ingredient3]

    def get_ingredients(self):
        return self.__ingredients
