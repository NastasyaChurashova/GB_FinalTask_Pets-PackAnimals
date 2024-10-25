import java.util.ArrayList;
import java.util.List;

public class Animals {
    private int id;
    protected String name;
    protected String birthdate;
    protected String colour;
    protected String breed;
    protected String owner;

    protected List<String> commands = new ArrayList();

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void helpHuman() {
        System.out.println(name + " is helping humans.");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
    return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public List<String> setCommands() {
    return commands;
    }

    public String getCommands() {
        return String.join(", ", commands);
    }
    public void addCommand(String command) {
        commands.add(command);
    }

    public void setCommands(List<String> commands) {
        this.commands = commands;
    }
}
