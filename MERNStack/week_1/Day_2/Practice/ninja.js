// parent Vehicle class
class Ninja {
    constructor(name, health, speed, strength) {
        this.name = name;
        this.health = 90;
        this.speed = 3;
        this.strength = 3;
    }
    sayName() {
        console.log(this.name);
        return this;
    }
    showStats() {
        console.log("Name: " + this.name + ", Health: " + this.health + ", Speed: " + this.speed + ", Strength: " + this.strength);
        return this;
    }
    drinkSake() {
        health += 10;
        return this;
    }


    

}
const ninja1 = new Ninja("Hyabusa");
ninja1.sayName();
ninja1.showStats();

