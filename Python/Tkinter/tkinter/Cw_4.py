import tkinter as tk
from tkinter.constants import CENTER

window = tk.Tk()
tekst1 = tk.StringVar()
tekst2 = tk.StringVar()

label1 = tk.Label(window, text="Podaj imię i nazwisko", font="Verdana 14", background="grey")
label2 = tk.Label(window, text="Podaj klasę", font="Verdana 14", background="#808080")
label3 = tk.Label(window, text="", font="Verdana 14", background="grey")
label4 = tk.Label(window, text="", font="Verdana 14", background="grey")
entry1 = tk.Entry(window, textvariable=tekst1, font=('none', 9,'italic'))
entry2 = tk.Entry(window, textvariable=tekst2, font=('none', 9,'italic'))
def change_label1():
    label3.config(text = "Witaj " + entry1.get())
def change_label2():
    label4.config(text= "z klasy " + entry2.get())
button = tk.Button(window, text="Podaj dane", bg="black", fg="white", font=("Arial", 12), command=change_label1)
button2 = tk.Button(window, text="Podaj klasę", bg="black", fg="white", font=("Arial", 12), command=change_label2)
window.title("ZSEiT")
window.geometry("720x720")
window.configure(bg='grey')
label1.grid(row=18, column=18)
button.grid(row=18, column=20)
entry1.grid(row=18, column=19)
entry2.grid(row=19, column=19)
label2.grid(row=19, column=18)
button2.grid(row=19, column=20)
label3.grid(row=20, column=18)
label4.grid(row=20, column=19)
window.mainloop()