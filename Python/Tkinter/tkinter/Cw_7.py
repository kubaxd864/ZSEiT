from distutils.log import error
from stringprep import b1_set
from tkinter import *
import random
    
root = Tk()
root.geometry("300x500")
root.title("Papier-Kamień-Nożyce")

computer_value = {
    "0":"Kamień",
    "1":"Papier",
    "2":"Nożyce"
}

global game_skill_mode
game_skill_mode = IntVar()

global playerpoints
playerpoints = IntVar()

global botpoints
botpoints = IntVar()
 
def reset_game():
    b4["state"] = "active"
    b5["state"] = "active"
    b6["state"] = "active"
    l1.config(text = "Player")
    l5.config(text = "Computer")
    l2.config(text = "0")
    l4.config(text = "")
    l6.config(text = "0")
    global playerpoints
    playerpoints.set(0)
    global botpoints
    botpoints.set(0)
    l4.config(fg = "black")

def btn_disable():
    b4["state"] = "disable"
    b5["state"] = "disable"
    b6["state"] = "disable"

def isEasy():
    global game_skill_mode
    game_skill_mode.set(1)
    global playerpoints
    playerpoints.set(0)
    global botpoints
    botpoints.set(0)
    reset_game()

def isMedium():
    global game_skill_mode
    game_skill_mode.set(2)
    global playerpoints
    playerpoints.set(0)
    global botpoints
    botpoints.set(0)
    reset_game()

def isHard():
    global game_skill_mode
    game_skill_mode.set(3)
    global playerpoints
    playerpoints.set(0)
    global botpoints
    botpoints.set(0)
    reset_game()

def playerwin():
    if playerpoints.get() == 0:
        playerpoints.set(1)
        l2.config(text = "1")
    elif playerpoints.get() == 1:
        playerpoints.set(2)
        l2.config(text = "2")
    elif playerpoints.get() == 2:
        playerpoints.set(3)
        l2.config(text = "3")
    elif playerpoints.get() == 3:
        playerpoints.set(4)
        l2.config(text = "4")
    elif playerpoints.get() == 4:
        playerpoints.set(5)
        l2.config(text = "5")
    elif playerpoints.get() == 5:
        playerpoints.set(6)
        l2.config(text = "6")
    elif playerpoints.get() == 6:
        playerpoints.set(7)
        l2.config(text = "7")
    elif playerpoints.get() == 7:
        playerpoints.set(8)
        l2.config(text = "8")
    elif playerpoints.get() == 8:
        playerpoints.set(9)
        l2.config(text = "9")
    elif playerpoints.get() == 9:
        playerpoints.set(10)
        l2.config(text = "10")

def botwin():
    if botpoints.get() == 0:
        botpoints.set(1)
        l6.config(text = "1")
    elif botpoints.get() == 1:
        botpoints.set(2)
        l6.config(text = "2")
    elif botpoints.get() == 2:
        botpoints.set(3)
        l6.config(text = "3")
    elif botpoints.get() == 3:
        botpoints.set(4)
        l6.config(text = "4")
    elif botpoints.get() == 4:
        botpoints.set(5)
        l6.config(text = "5")
    elif botpoints.get() == 5:
        botpoints.set(6)
        l6.config(text = "6")
    elif botpoints.get() == 6:
        botpoints.set(7)
        l6.config(text = "7")
    elif botpoints.get() == 7:
        botpoints.set(8)
        l6.config(text = "8")
    elif botpoints.get() == 8:
        botpoints.set(9)
        l6.config(text = "9")
    elif botpoints.get() == 9:
        botpoints.set(10)
        l6.config(text = "10")

def win():
    if playerpoints.get() == 10:
        l4.config(text = "Gracz Wygrywa",fg = "green")
        btn_disable()
    elif botpoints.get() == 10:
        l4.config(text = "Komputer Wygrywa",fg = "red")
        btn_disable()
    elif botpoints.get() - playerpoints.get() == 3:
        l4.config(text = "Komputer Wygrywa",fg = "red")
        btn_disable()
    elif playerpoints.get() - botpoints.get() == 3:
        l4.config(text = "Gracz Wygrywa",fg = "green")
        btn_disable()

def isrock():
    if game_skill_mode.get() == 1:
        match_result = "Gracz Wygrywa"
        l4.config(text = match_result)
        l1.config(text = "Kamień")
        l5.config(text = "Papier")
        playerwin()
        win()
    elif game_skill_mode.get() == 2:
        c_v = computer_value[str(random.randint(0,2))]
        if c_v == "Kamień":
            match_result = "Remis"
            playerwin()
            botwin()
            win()
        elif c_v=="Nożyce":
            match_result = "Gracz Wygrywa"
            playerwin()
            win()
        else:
            match_result = "Komputer Wygrywa"
            botwin()
            win()
        l4.config(text = match_result)
        l1.config(text = "Kamień")
        l5.config(text = c_v)
    elif game_skill_mode.get() == 3:
        match_result = "Komputer Wygrywa"
        l4.config(text = match_result)
        l1.config(text = "Kamień")
        l5.config(text = "Nożyce")
        botwin()
        win()
 
def ispaper():
    if game_skill_mode.get() == 1:
        match_result = "Gracz Wygrywa"
        l4.config(text = match_result)
        l1.config(text = "Papier")
        l5.config(text = "Nożyce")
        playerwin()
        win()
    elif game_skill_mode.get() == 2:
        c_v = computer_value[str(random.randint(0, 2))]
        if c_v == "Papier":
            match_result = "Remis"
            playerwin()
            botwin()
            win()
        elif c_v=="Nożyce":
            match_result = "Komputer Wygrywa"
            botwin()
            win()
        else:
            match_result = "Gracz Wygrywa"
            playerwin()
            win()
        l4.config(text = match_result)
        l1.config(text = "Papier")
        l5.config(text = c_v)
    elif game_skill_mode.get() == 3:
        match_result = "Komputer Wygrywa"
        l4.config(text = match_result)
        l1.config(text = "Papier")
        l5.config(text = "Kamień")
        botwin()
        win()
 
def isscissor():
    if game_skill_mode.get() == 1:
        match_result = "Gracz Wygrywa"
        l4.config(text = match_result)
        l1.config(text = "Nożyce")
        l5.config(text = "Papier")
        playerwin()
        win()
    elif game_skill_mode.get() == 2:
        c_v = computer_value[str(random.randint(0,2))]
        if c_v == "Kamień":
            match_result = "Komputer Wygrywa"
            botwin()
            win()
        elif c_v == "Nożyce":
            match_result = "Remis"
            playerwin()
            botwin()
            win()
        else:
            match_result = "Gracz Wygrywa"
            playerwin()
            win()
        l4.config(text = match_result)
        l1.config(text = "Nożyce")
        l5.config(text = c_v)
    elif game_skill_mode.get() == 3:
        match_result = "Komputer Wygrywa"
        l4.config(text = match_result)
        l1.config(text = "Nożyce")
        l5.config(text = "Papier")
        botwin()
        win()
 
Label(root,text = "Papier-Kamień-Nożyce",font = "normal 20 bold",fg = "black").pack(pady = 20)

frame = Frame(root)
frame.pack(pady=30)

l1 = Label(frame,text = "Wybierz poziom trudności",font = "normal 15 bold").pack(pady=30)

b1 = Button(frame, text = "Łatwy",font = 10, width = 7,command = isEasy).pack(side = LEFT, padx = 10)
 
b2 = Button(frame, text = "Średni",font = 10, width = 7,command = isMedium).pack(side = LEFT,padx = 10)
 
b3 = Button(frame, text = "Trudny",font = 10, width = 7,command = isHard).pack(padx = 10)

frame1 = Frame(root)
frame1.pack()
 
l1 = Label(frame1,text = "Gracz",font = 10)
l2 = Label(frame1,text = "0",font = 10)
 
l3 = Label(frame1,text = "vs",font = 2)
 
l5 = Label(frame1, text = "Komputer", font = 10)
l6 = Label(frame1, text = "0", font = 10)

 
l1.pack(side = LEFT)
l2.pack(side = LEFT)
l3.pack(side = LEFT)
l5.pack(side = LEFT)
l6.pack(side = LEFT)
 
l4 = Label(root,
           text = "",
           font = "normal 20 bold",
           bg = "white",
           width = 15 ,
           borderwidth = 2,
           relief = "solid")
l4.pack(pady = 20)
 
frame2 = Frame(root)
frame2.pack()
 
b4 = Button(frame2, text = "Kamień",
            font = 10, width = 7,
            command = isrock)
 
b5 = Button(frame2, text = "Papier",
            font = 10, width = 7,
            command = ispaper)
 
b6 = Button(frame2, text = "Nożyce",
            font = 10, width = 7,
            command = isscissor)
 
b4.pack(side = LEFT, padx = 10)
b5.pack(side = LEFT,padx = 10)
b6.pack(padx = 10)
 
Button(root, text = "Restart",
       font = 10, fg = "red",
       bg = "black", command = reset_game).pack(pady = 20)
 
root.mainloop()