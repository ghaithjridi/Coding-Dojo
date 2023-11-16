class Player:
    list_of_players=[]
    def __init__(self, name, age, position, team):
        self.name = name
        self.age = age
        self.position = position
        self.team = team
        Player.list_of_players.append(self)



player_kevin =Player ("Kevin Durant",34, "small forward","Brooklyn Nets")

player_jason =Player ("Jason Tatum", 24, "small forward","Boston Celtics")

player_kyrie =Player ( "Kyrie Irving",32, "Point Guard",  "Brooklyn Nets")
    

 
for one_player in Player.list_of_players:
    
    print(f"{one_player.name}-{one_player.age}-{one_player.position}-{one_player.team}")


