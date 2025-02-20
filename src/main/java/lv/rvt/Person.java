package lv.rvt;

public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;
    private SimpleDate birthday;

    public Person(String initialName, int initialAge, int initialWeight, int initialHeight) {   
        this.name = initialName;
        this.age = initialAge;
        this.weight = initialWeight;
        this.height = initialHeight;
    }

    public Person(String initialName) {   
        this.name = initialName;
    }

    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }

    public void growOlder() {
        if (this.age < 30) {
            this.age = this.age + 1;
        }
    }

    public int returnAge() {
        return this.age;
    }

    public boolean isOfLegalAge() {
        if (this.age < 18) {
            return false;
        }

        return true;
    }



    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }
}