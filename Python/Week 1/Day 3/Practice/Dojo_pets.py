class Ninja:
    def __init__(self,first_name,last_name,treats,pet_food,pet):
        self.first_name=first_name
        self.last_name= last_name
        self.treats=treats
        self.pet_food=pet_food
        self.pet=pet
    
    def walk(self):
        self.pet.play()
    def feed(self):
        self.pet.eat()
        
    def bathe(self):
        self.pet.noise()
    
    
    
            
    
class Pet:
    def __init__(self,name,type,tricks,health,energy):
        self.name=name
        self.type=type
        self.tricks=tricks
        self.health=health
        self.energy=energy
    
    def sleep(self):
        pass
    def eat(self):
        self.health=self.health+5
    def play(self):
        pass
    def noise(self):
        pass