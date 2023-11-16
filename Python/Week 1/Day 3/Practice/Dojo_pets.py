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
        self.energy+=25
    def eat(self):
        self.health += 10 
        self.energy+=5
    def play(self):
        self.health += 10
        print(f"{self.name} health is now {self.health}")
    
    def noise(self):
        print("meow")
wanda = Pet("wanda","dog","jump",100,100)
ghaith=Ninja("ghaith","jridi","Kind","fish",wanda)

ghaith.walk()
wanda.noise()