
EmployeeArray = []

class Employee:
	Employee_count = 0
	def __init__(self,imie,nazwisko,email,salary,employeeId):
		self.imie = imie
		self.nazwisko = nazwisko
		self.email = email
		self.salary = salary
		self.full_name = imie + " " + nazwisko
		self.employeeId = employeeId
		Employee.Employee_count+=1
		print("ID pracownika: ",self.employeeId)
		
	def get_annual_salary(self):
		return self.salary*12
	
	def show_employee_information(self):
		print("Pracownik:",self.full_name, 
		" adres e-mail: ",self.email, 
		" wynagrodzenie miesięczne", self.salary)

def menu():
	print("################################")
	print("# 1. Dodaj pracownika          #")
	print("# 2. Płaca roczna              #")
	print("# 3. Informacje o pracowniku   #")
	print("# 4. Lista pracowników         #")
	print("# 5. Wyjście                   #")
	print("################################")
	a = int(input())
	return a 
	
def addEmployee():
	imie = input("Podaj imie: ")
	nazwisko = input("Podaj nazwisko: ")
	emial = input("podaj adres email: ")
	sallary = input("podaj miesięczne dochody: ")
	p = Employee(imie,nazwisko,emial,int(sallary),len(EmployeeArray))
	EmployeeArray.append(p)
	print(EmployeeArray[len(EmployeeArray)-1].full_name)
	
if __name__ == "__main__":
	while True:
		wybor =menu()
		
		if wybor   == 1:
			addEmployee()
		elif wybor == 2:
			a = int(input("podaj Id procownika "))
			print(EmployeeArray[a].salary)
		elif wybor == 3:
			a = int(input("podaj Id procownika "))
			EmployeeArray[a].show_employee_information()
		elif wybor == 4:
			a = len(EmployeeArray)
			for i in range(a):
				print(i,".",EmployeeArray[i].full_name)
		elif wybor == 5:
			break
		else:
			print("Nie ma takiego wyboru")