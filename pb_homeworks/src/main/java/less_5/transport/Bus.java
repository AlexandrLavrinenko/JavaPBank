package less_5.transport;

import less_5.human.Passenger;

public class Bus extends Transport {
    private String driversName, route, nameBus;
    public static String[] busStops = {"Автовокзал", "Бульвар Славы", "ул. Высоковольтная", "ул. Гагарина",
            "ул. Добровольцев", "ул. Есенина", "ул. Железнодорожная"};
    private static Passenger[] passengers = new Passenger[6];

    private static int cntPass = 0;
    private static int currentStop = 0;

    public Bus() {
        super();
        this.driversName = "Саруман Акаев";
        this.route = "72";
        this.nameBus = "городской маршрут";
    }

    public Passenger[] getPassengers() {
        return passengers;
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
        System.out.println("Начало маршрута - остановка " + busStops[getCurrentStop()]);
    }

    public Boolean hasNexStop() {
        boolean result;
        if (getCurrentStop() < busStops.length - 2) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static void setCntPass(int cntPass) {
        Bus.cntPass = cntPass;
    }

    public static int getCntPass() {
        return cntPass;
    }

    public static void addToPassangers(Passenger passenger) {
        passengers[getCntPass()] = passenger;
        setCntPass(getCntPass()+1);
    }

    @Override
    public void stop() {
        System.out.println("Остановка номер " + (getCurrentStop()+1) + " ---------------------------------");
        System.out.println("Автобус останавливается у остановки: " + busStops[getCurrentStop()+1]);
        setCurrentSpeed(0);
        System.out.println("Двери открываются.");
        if (hasNexStop()) {
            System.out.println("Следующая остановка: " + busStops[getCurrentStop()+2]);
            setCurrentStop(getCurrentStop() + 1);
        } else {
            System.out.println("Конечная остановка. Всем пассажирам покинуть салон.");
        }
    }

    @Override
    public void run(int currentSpeed) {
 //       System.out.println("Остановка: " + busStops[getCurrentStop()]);
        System.out.println("Двери закрываются.");
        System.out.println("Количество пассажиров (людей) за поездку: " + getCntPass());
        System.out.println("Текущая скорость: " + getCurrentSpeed());
        System.out.println("Автобус разгоняетя до " + currentSpeed + " км/ч");
        setCurrentSpeed(currentSpeed);
    }
}