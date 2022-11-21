import tkinter as tk
from tkinter.constants import CENTER

window = tk.Tk()

label1 = tk.Label(window, text="Imię", font="Verdana 20 bold italic", background="grey")
label2 = tk.Label(window, text="Nazwisko", font="Verdana 20 italic bold", background="#808080")

def change_label1():
    label1.config(text="Jakub")
def change_label2():
    label2.config(text="Sobczyk")
button = tk.Button(window, text="przycisk1", bg="black", fg="white", font=("Arial", 12), command=change_label1)
button2 = tk.Button(window, text="przycisk2", bg="black", fg="white", font=("Arial", 12), command=change_label2)

window.title("ZSEiT")
window.geometry("480x480")
window.configure(bg='grey')
label1.grid(row=18, column=18)
button.grid(row=18, column=19)

label2.grid(row=19, column=18)
button2.grid(row=19, column=19)
window.mainloop()