public class Gorilla extends Mammal {
    public Gorilla(int energyLevel){
        super(energyLevel);
    }

    public void throwSomething(){
        System.out.println("throw");
        energyLevel = energyLevel - 5;
    }
    
    public void eatBanana(){
        System.out.println("eat banana");
        energyLevel = energyLevel + 10;
    }

    public void climb(){
        System.out.println("climb");
        energyLevel = energyLevel - 10;
    }
}
