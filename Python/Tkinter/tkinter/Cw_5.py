from tkinter import Tk, Entry, Label, Button

a = {"login": "marcin", "pwd": "ok"}


class EntryWithPlaceholder(Entry):
    def __init__(self, master=None, placeholder="", color="grey"):
        super().__init__(master, width=26)

        self.placeholder = placeholder
        self.placeholder_color = color
        self.default_fg_color = self["fg"]

        self.bind("<FocusIn>", self.foc_in)
        self.bind("<FocusOut>", self.foc_out)

        self.put_placeholder()

    def put_placeholder(self):
        self.insert(0, self.placeholder)
        self['fg'] = self.placeholder_color

    def foc_in(self, *args):
        if self['fg'] == self.placeholder_color:
            self.delete('0', 'end')
            self['fg'] = self.default_fg_color

    def foc_out(self, *args):
        if not self.get():
            self.put_placeholder()


class App:
    def __init__(self, master):
        self.master = master
        master.title("Logowanie")
        # master.geometry("400x300")
        master.resizable(0, 0)

        self.login_entry = EntryWithPlaceholder(master, placeholder="Podaj nazwę użytkownika")
        self.login_entry.grid(row=1, column=1, padx=(10, 10), pady=(10, 10))

        self.pwd_entry = EntryWithPlaceholder(master, placeholder="Podaj hasło użytkownika")
        self.pwd_entry.grid(row=3, column=1, padx=(10, 10), pady=(10, 10))

        self.login_btn = Button(master, text="Zaloguj się",
                                command=lambda: self.show_login_info(self.login_entry.get(), self.pwd_entry.get()))
        self.login_btn.grid(row=5, column=1, padx=(10, 10), pady=(10, 10))

        self.login_result = Label(master, text="Czekam na zalogowanie")
        self.login_result.grid(row=7, column=1, padx=(10, 10), pady=(10, 10))

    def show_login_info(self, login, pwd):
        if login == a["login"]:
            if pwd == a["pwd"]:
                self.login_result.config(text="Użytkownik zalogowany")
            else:
                self.login_result.config(text="Niepoprawne dane logowania")
        else:
            self.login_result.config(text="Użytkownik nie istnieje")


root = Tk()
app = App(root)
root.mainloop()
