from tkinter import *


class RozszerzonyButton(Button):
    
    def __init__(self, window, color="green"):
        super().__init__(window, text="tekst")
        self.window = window
        self.color = color 
        self.bind("<Enter>", self.on_entry)
        self.bind("<Leave>", self.on_leave)
    
    def on_entry(self,e):
        self['background']=self.color 
        
    def on_leave(self,e):
        self['background']='SystemButtonFace'
        
class App:
    def __init__(self, window):
        self.window = window
        self.button = RozszerzonyButton(window)
        self.button.grid()
        

window= Tk()
app=App(window)
window.mainloop()
window.geometry = ("1000x1000")     
    
   
    



