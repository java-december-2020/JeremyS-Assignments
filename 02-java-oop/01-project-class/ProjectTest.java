public class ProjectTest {
    public static void main(String[] args){
        Project elevatorPitch = new Project("test", "testing description");
        String pitchName = elevatorPitch.getName();
        String pitchDescription = elevatorPitch.getDescription();
        System.out.println(pitchName + pitchDescription);
    }    
}
