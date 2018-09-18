package less_5.transport;

import less_5.human.Passenger;

public class Bus extends Transport {
    private String driversName, route, nameBus;
    public String[] busStops = {"Автовокзал", "ЦУМ", "ул. Аэрофлотская", "ул. Малиновского", "ул. Б.Хмельницкого", "Автобазар", "ж/м Северный"};
    public Passenger[] passengers = {};
    private int currentStop = 0;

    public Bus() {
        super();
        this.driversName = "Саруман Акаев";
        this.route = "72";
        this.nameBus = "городской маршрут";
    }

    public int getCurrentStop() {
        return currentStop;
    }

    public void setCurrentStop(int currentStop) {
        this.currentStop = currentStop;
    }

    public String getDriversName() {
        return driversName;
    }

    public void setDriversName(String driversName) {
        this.driversName = driversName;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getNameBus() {
        return nameBus;
    }

    public void setNameBus(String nameBus) {
        this.nameBus = nameBus;
    }

    public Bus(String mark, String color, int passPlaces, String nameBus, String route, String driversName) {
        super(mark, color, passPlaces);
        setNameBus(nameBus);
        setRoute(route);
        setDriversName(driversName);
    }

    public void hiSpeech() {
        System.out.println("Добрый день! Меня зовут " + getDriversName() + ". Наш " + getNameBus() + " следует по маршруту " + getRoute());
        System.out.println("Отправляемся с остановки " + busStops[getCurrentStop()]);
    }

    public Boolean hasNexStop() {
        boolean result;
        if (getCurrentStop() < busStops.length - 1) {
            result = true;
        } else {
            result = false;
        }
            return result;
    }

    @Override
    public void stop() {
        System.out.println("Автобус останавливается у остановки: " + busStops[getCurrentStop()]);
        setCurrentSpeed(0);
        System.out.println("Двери открываются.");
        if(hasNexStop()){
            System.out.println("Следующая остановка: " + busStops[getCurrentStop()+1]);
            setCurrentStop(getCurrentStop()+1);
        }else {
            System.out.println("Конечная остановка. Всем пассажирам покинуть салон.");
        }
    }

    @Override
    public void run(int currentSpeed) {
        System.out.println("Двери закрываются.");
        System.out.println("Остановка: " + busStops[getCurrentStop()]);
        System.out.println("Текущая скорость: " + getCurrentSpeed());
        System.out.println("Автобус разгоняетя до " + currentSpeed + " км/ч");
        setCurrentSpeed(currentSpeed);
    }
}