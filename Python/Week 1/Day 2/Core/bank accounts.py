class BankAccount:
    all_instances=[]
    def __init__(self, int_rate, balance=0): 
        self.int_rate = int_rate
        self.balance = balance
        BankAccount.all_instances.append(self)
        
        
    def deposit(self, amount):
        self.balance += amount
    
    def withdraw(self, amount):
        if (self.balance - amount) > 0:
            self.balance -= amount
        else:
            print( "Insufficient funds: Charging a $5 fee and deduct $5")
    

        
    def display_account_info(self):
        print(self.balance)
        
    def yield_interest(self):
        if self.balance > 0:
            self.balance += (self.balance*self.int_rate)
            
   
ghaith=BankAccount(0.2, 100)
Bilel=BankAccount(0.5, 200)



