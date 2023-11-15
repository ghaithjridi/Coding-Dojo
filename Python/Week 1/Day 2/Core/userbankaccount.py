class BankAccount:
    
    def __init__(self, int_rate, balance=0): 
        self.int_rate = int_rate
        self.balance = balance
       
        
        
    def deposit(self, amount):
        self.balance += amount
        return self
    
    def withdraw(self, amount):
        if (self.balance < amount) > 0:
            self.balance -= amount
        else:
            self.balance-= 5.00
            print( "Insufficient funds: Charging a $5 fee and deduct $5")
        return self

        
    def display_account_info(self):
        print("balance:$"+ str (self.balance))
        return self
    
    def yield_interest(self):
        if self.balance > 0:
            self.balance += self.balance*self.int_rate
        return self  
   
ghaith=BankAccount(0.05)
Bilel=BankAccount(0.05)

ghaith.deposit(1000).deposit(1000).deposit(1000).withdraw(500).yield_interest().display_account_info()
Bilel.deposit(2000).deposit(2000).withdraw(1000).withdraw(1000).withdraw(1000).withdraw(1000).yield_interest().display_account_info()


class User:
    def __init__(self, name, email):
        self.name = name
        self.email = email
        self.account = BankAccount(int_rate=0.02, balance=0)
    
   
    
    def make_deposit(self, amount):
        self.account.deposit(amount)
            return self
        
    def  make_withdraw(self, amount):
        self.account.withdraw(amount)
        
    def displya_user_balance(self , amount):
        self.account.display_account_info(amount)
        
    






