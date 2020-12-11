public class Mammal {
    protected int energyLevel = 100;

    public Mammal(int energy){
        this.energyLevel = energy;
    }

    public int displayEnergyLevel(){
        System.out.println(this.energyLevel);
        return energyLevel;
    }
}