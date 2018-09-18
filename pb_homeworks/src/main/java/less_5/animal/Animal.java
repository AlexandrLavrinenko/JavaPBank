package less_5.animal;

public class Animal {
    protected int height,age,weight;

    public Animal(){
        this.height = 80;
        this.age = 2;
        this.weight = 40;
    }

    public Animal(int height, int age, int weight) {
        this.height = height;
        this.age = age;
        this.weight = weight;
    }

    public void goAhead() {
        System.out.println("Животное идет");
    }
    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

}