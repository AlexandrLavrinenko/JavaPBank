package less_5.human;

import less_5.transport.BusStops;

public class Passenger extends Human {
    private int numberStop;
    private Boolean hasDog = false;

    public int getNumberStop() {
        return numberStop;
    }

    public void setNumberStop(int numberStop) {
        this.numberStop = numberStop;
    }

    public Boolean getHasDog() {
        return hasDog;
    }

    public void setHasDog(Boolean hasDog) {
        this.hasDog = hasDog;
    }

    public Passenger(String name, int height, int age, int weight, int numberStop, boolean hasDog) {
        super(name, height, age, weight);
        this.numberStop = numberStop;
        this.hasDog = hasDog;
    }

    public Passenger() {
        setName("Эммануил Гидеонович");
        setHeight(180);
        setAge(35);
        setWeight(70);
        setNumberStop(1);
        setHasDog(false);

    }

    public void getInBus() {
        System.out.println("Пассажир " + getName() + " зашел в автобус.");
    }

    public void getOutBus() {
        System.out.println("Пассажир " + getName() + " вышел из автобуса.");
    }

}
