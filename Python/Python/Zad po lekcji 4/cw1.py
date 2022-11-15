class Laptop:
	def __init__(self,brand,model,price):
		self.brand = brand
		self.model = model
		self.price = price
	def show_info(self):
		return("Brand: "+ self.brand, "Model: " + self.model, "Price: " + str(self.price) + " zł")
	def pln_to_usd(self):
		usd_price = int(self.price) / 4.89
		return("Cena w dolarach to: "+ str(usd_price) + " usd")
	def check(self):
		type_check = isinstance(self.price, int)
		if type_check == False:
			print("Podana cena ma niewłaściwy typ danej")
		elif int(self.price) < 0:
			print("Cena nie może być mniejsza od zera")



array = []
for i in range(5):
	k1 = Laptop("Dell","Inspiron 5580", 3112)
	array.append(k1)

	k2 = Laptop("Toshiba","Satelite L-50", 1753)
	array.append(k2)


print(array[0].show_info())
print(array[0].pln_to_usd())
print(array[0].check())
print(array[1].check())
