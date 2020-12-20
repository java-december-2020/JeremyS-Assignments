public class HumanTest {
    public static void main(String [] args){
        Human wizard = new Human();
        Human ninja = new Human();
        wizard.display();
        ninja.display();
        wizard.attack(ninja);
        ninja.display();
    }
    
}
