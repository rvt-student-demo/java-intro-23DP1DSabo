package lv.rvt;

public class Agent {

    private String name;
    private String name2;

    public Agent(String initialName, String initialName2) {
        this.name = initialName;
        this.name2 = initialName2;
    }

    public String toString() {
        return "My name is " + this.name2 + ", " + this.name + " " + this.name2;
    }
}
