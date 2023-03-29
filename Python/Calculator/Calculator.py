import re

print("Kalulator")
print("Aby wyjść wpisz 'wyjście'")

result = 0
run = True

def performMath():
    global run
    global result
    equation = ""
    if result == 0:
        equation = input("Wpisz równanie: ")
    else:
        equation = input(str(result))
    

    if equation == 'wyjście':
        print("Do widzenia...")
        run = False
    else:
        equation = re.sub('[a-zA-Z,.:()" "]', '', equation)
        if result == 0:
            result = eval(equation)
        else:
            result = eval(str(result) + equation)

while run:
    performMath()