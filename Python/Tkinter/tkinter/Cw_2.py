import tkinter as tk;

root =tk.Tk()

myLabel = tk.Label(root,text="Jakub",font=("Arial",24,"italic","bold","underline"),fg="black",bg="lightgrey")
message = tk.Label(root,text="Sobczyk",font=("Arial",24,"italic","bold","underline"),fg="black",bg="lightgrey")


tekst = tk.StringVar
root.title('3TPgr2')
root.geometry("550x650")
root.configure(background="grey")



myLabel.pack()
message.pack()

root.mainloop()