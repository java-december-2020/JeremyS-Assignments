public class Human {
    private int strength = 3;
    private int stealth = 3;
    private int intelligence = 3;
    private int health = 100;

    public Human(){
        this.strength = 3;
        this.stealth = 3;
        this.intelligence = 3;
        this.health = 100;
    }

    public void attack(Human target) {
        target.health -= this.strength;
    }

    public void display(){
        System.out.printf("Strength: %d%n Stealth: %d%n Intelligence: %d%n Health: %d%n", this.strength, this.stealth, this.intelligence, this.health);
    }

}