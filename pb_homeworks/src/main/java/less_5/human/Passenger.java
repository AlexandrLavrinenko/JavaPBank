package less_5.human;

import less_5.transport.Bus;

public class Passenger extends Human {
    private int numberStop;
    public int getNumberStop() {
        return numberStop;
    }

    public void setNumberStop(int numberStop) {
        this.numberStop = numberStop;
    }

    public Passenger(String name, int height, int age, int weight, int numberStop) {
        super(name, height, age, weight);
        this.numberStop = numberStop;
    }

    public Passenger() {
        setName("Эммануил Гидеонович");
        setHeight(180);
        setAge(35);
        setWeight(70);
        setNumberStop(6);
    }

    public void getInBus() {
        System.out.println("Пассажир " + getName() + " зашел в автобус.");
        Bus.addToPassangers(this);
    }

    public void getOutBus() {
        System.out.println("Пассажир " + getName() + " вышел из автобуса.");
    }

    public void checkNmmberStop(int numberStop) {
        if (getNumberStop() == numberStop) {
            getOutBus();
        }
    }

}
