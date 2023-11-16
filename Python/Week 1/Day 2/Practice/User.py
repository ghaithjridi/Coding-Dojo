# declare a class and give it name User
class User:		
    def __init__(self, first_name, last_name, email, age):
        self.first_name = first_name
        self.last_name = last_name
        self.email=email        
        self.age = age
        self.is_rewards_member=False
        self.gold_card_points = 0

    def display_info(self):
        print(f"Hello, my name is {self.first_name} {self.last_name} {self.email} {self.age} {self.is_rewards_member} {self.gold_card_points}")
    def enroll(self):
        self.is_rewards_member = True
        self.gold_card_points = 200
        print(f"hekugkjb")
    def spend_points(self, amount):
        self.gold_card_points-=amount
        
        
        
user = User("ghaith","jridi","ghaithjridi5@gmail.com",24)
user.display_info()
user.enroll()
user.spend_points(100)



        
        

        

        