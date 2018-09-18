package less_5.human;

public class Human {
    private String name;
    private int height,age,weight;

    public Human(String name, int height, int age, int weight) {
        this.name = name;
        this.height = height;
        this.age = age;
        this.weight = weight;
    }

    public Human() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
