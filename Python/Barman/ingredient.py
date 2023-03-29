class Ingredient:
    def __init__(self, name, amount):
        self.__name = name
        self.__amount = amount

    def get_name(self):
        return self.__name

    def get_amount(self):
        return self.__amount
