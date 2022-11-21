from tkinter import *
from tkinter import messagebox

window = Tk()

window.title("Tic-Tac-Toe ")
window.geometry("400x300")

label = Label(window, text="Gracz X")
label.grid(row=0, column=0)

label = Label(window, text="Gracz O")
label.grid(row=1, column=0)

turn = 1

def clickedprocessing():
    
    global turn
    if turn == 1:
        turn = 2
        return "X"
    elif turn == 2:
        turn = 1;
        return "O"


def clicked1():
    
    global turn
    if button1["text"] == " ":
        button1["text"] = clickedprocessing()
        check()

def clicked2():
    
    global turn
    if button2["text"] == " ":
        button2["text"] = clickedprocessing()
        check()

def clicked3():
    
    global turn
    if button3["text"] == " ":
        button3["text"] = clickedprocessing()
        check()

def clicked4():
    
    global turn
    if button4["text"] == " ":
        button4["text"] = clickedprocessing()
        check()

def clicked5():
    
    global turn
    if button5["text"] == " ":
        button5["text"] = clickedprocessing()
        check()

def clicked6():
    
    global turn
    if button6["text"] == " ":
        button6["text"] = clickedprocessing()
        check()

def clicked7():
    
    global turn
    if button7["text"] == " ":
        button7["text"] = clickedprocessing()
        check()

def clicked8():
    
    global turn
    if button8["text"] == " ":
        button8["text"] = clickedprocessing()
        check()

def clicked9():
    
    global turn
    if button9["text"] == " ":
        button9["text"] = clickedprocessing()
        check()
        
def check():
    
    b1 = button1["text"]
    b2 = button2["text"]
    b3 = button3["text"]
    b4 = button4["text"]
    b5 = button5["text"]
    b6 = button6["text"]
    b7 = button7["text"]
    b8 = button8["text"]
    b9 = button9["text"]
    flag += 1
    
    if b1 == b2 and b1 == b3 and b1 == "O" or b1 == b2 and b1 == b3 and b1 == "X":
        win(b1)
    if b4 == b5 and b4 == b6 and b4 == "O" or b4 == b5 and b4 == b6 and b4 == "X":
        win(b4)
    if b7 == b8 and b7 == b9 and b7 == "O" or b7 == b8 and b7 == b9 and b7 == "X":
        win(b7)
    if b1 == b4 and b1 == b7 and b1 == "O" or b1 == b4 and b1 == b7 and b1 == "X":
        win(b1)
    if b2 == b5 and b2 == b8 and b2 == "O" or b2 == b5 and b2 == b8 and b2 == "X":
        win(b2)
    if b3 == b6 and b3 == b9 and b3 == "O" or b3 == b6 and b3 == b9 and b3 == "X":
        win(b3)
    if b1 == b5 and b1 == b9 and b1 == "O" or b1 == b5 and b1 == b9 and b1 == "X":
        win(b1)
    if b7 == b5 and b7 == b3 and b7 == "O" or b7 == b5 and b7 == b3 and b7 == "X":
        win(b7)
    elif flag == 9:
        messagebox.showinfo("DRAW !", "DRAW")
        window.destroy()
    
    def win(player):
        ans = "Zwyciezyl" +player
        messagebox.showinfo("Wygrana", ans)
        window.destroy()
    
button1 = Button(window, text=" ", bg="green", fg="Black", width=3, height=1, font=('Helvetica', '20'), command=clicked1)
button1.grid(column=1, row=1)
button2 = Button(window, text=" ", bg="green", fg="Black", width=3, height=1, font=('Helvetica', '20'), command=clicked2)
button2.grid(column=2, row=1)
button3 = Button(window, text=" ", bg="green", fg="Black", width=3, height=1, font=('Helvetica', '20'), command=clicked3)
button3.grid(column=3, row=1)
button4 = Button(window, text=" ", bg="green", fg="Black", width=3, height=1, font=('Helvetica', '20'), command=clicked4)
button4.grid(column=1, row=2)
button5 = Button(window, text=" ", bg="green", fg="Black", width=3, height=1, font=('Helvetica', '20'), command=clicked5)
button5.grid(column=2, row=2)
button6 = Button(window, text=" ", bg="green", fg="Black", width=3, height=1, font=('Helvetica', '20'), command=clicked6)
button6.grid(column=3, row=2)
button7 = Button(window, text=" ", bg="green", fg="Black", width=3, height=1, font=('Helvetica', '20'), command=clicked7)
button7.grid(column=1, row=3)
button8 = Button(window, text=" ", bg="green", fg="Black", width=3, height=1, font=('Helvetica', '20'), command=clicked8)
button8.grid(column=2, row=3)
button9 = Button(window, text=" ", bg="green", fg="Black", width=3, height=1, font=('Helvetica', '20'), command=clicked9)
button9.grid(column=3, row=3)

flag = 0

window.mainloop()