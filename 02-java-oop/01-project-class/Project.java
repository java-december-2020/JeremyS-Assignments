public class Project{
    private String name;
    private String description;

    public Project() {
        this.name = "default";
        this.description = "default";
    }

    public Project(String name) {
        this.name = name;
        this.description = "default";
    }

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

    //getter
    public String getName() {
        return name;
    }
    // setter
    public void setName(String name) {
        this.name = name;        
    }

    //getter
    public String getDescription() {
        return description;
    }
    // setter
    public void setDescription(String description) {
        this.description = description;        
    }
}