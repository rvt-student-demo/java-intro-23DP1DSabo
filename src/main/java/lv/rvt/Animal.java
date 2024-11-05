package lv.rvt;

public class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String toString() {
        return "This animal is a " + this.name + ". ";
    }

}
