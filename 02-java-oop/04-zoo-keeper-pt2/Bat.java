public class Bat extends Mammal {
    public Bat(int energyLevel){
        super(300);
    }

    public void fly(){
        System.out.println("hey I am a Bat");
        energyLevel = energyLevel - 50;
    }

    public void eatHumans(){
        System.out.println("eating humans");
        energyLevel = energyLevel + 25;
    }

    public void attackTown(){
        System.out.println("I am attacking");
        energyLevel = energyLevel - 100;
    }
}