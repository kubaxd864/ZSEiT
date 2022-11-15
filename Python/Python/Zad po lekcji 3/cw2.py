class ksiazka:
	def __init__(self,title,pages,author,date,owner):
		self.title = title
		self.pages = pages
		self.author = author
		self.date = date
		self.owner = owner
	def info(self):
		return self.title, self.pages,self.author,self.date,self.owner
	def swap(self,new):
		self.owner = new

array = []
for i in range(5):
	k1 = ksiazka("eragon",300,"Christopher Nolan", "10-06-2003","ja")
	array.append(k1)
print(array[0].info())
array[0].swap("ktoś")
print(array[0].owner)
