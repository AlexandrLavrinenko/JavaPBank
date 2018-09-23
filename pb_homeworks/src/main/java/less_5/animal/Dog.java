package less_5.animal;

import less_5.human.Passenger;

public class Dog extends Animal {
    String name;
    Passenger owner;

    public Dog(int height, int age, int weight, String name, Passenger owner) {
        super(height, age, weight);
        this.name = name;
        this.owner = owner;
    }

    public Passenger getOwner() {
        return owner;
    }

    public String getName() {
        return name;
    }

    public void getInBus(Passenger owner) {
        System.out.println("Собкака по кличке " + getName() + " зашла за хозяном по имени " + owner.getName() + " в автобус.");
    }

    public void getOutBus(Passenger owner) {
        System.out.println("Собкака по кличке " + getName() + " вышла вслед за хозяном по имени " + owner.getName() + " из автобуса.");
    }
}
