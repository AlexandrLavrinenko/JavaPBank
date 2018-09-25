package less_5;

import less_5.animal.Dog;
import less_5.human.Passenger;
import less_5.transport.Bus;

/**
 * Смоделировать жизненную ситуацию (с помощью методов и свойств объектов):
 * 1) Автобус трогается с первой остановки
 * 2) Автобус останавливается на 2-й остановке в него садятся Человек и Собака
 * 3) на 4-й остановке они выходят и входят 4 Человека
 * 4) 4 человека выходят на конечной остановке
 *
 * Все остановки должны иметь названия.
 * Объекты должны иметь только свои свойства и методы (без дублирования чужих).
 * Результат работы программы - в методе main последовательный вызов нужных методов и изменение свойств объектов -
 * для достижения результата задачи, и вывод соответствующей информации в консоль.
 * Объекты должны быть связаны между собой для определенного действия - собака не может сесть в автобус без человека.
 * При описании классов их следует разместить по пакетам и добавить описание методов (javadoc).
 * Чем больше деталей - тем лучше.
 */

public class TripByRoute {
    public static void main(String[] args) {
        Bus bus = new Bus("Mercedes","Yellow", 40, "пассажирский автобус","3A", "Василий");
        Passenger pass1 = new Passenger("Куклачев",160,60,75,4);
        Dog dog = new Dog(40, 3, 60,"Рэкс", pass1);
        Passenger pass2 = new Passenger("Агент Смит", 182, 40, 80, 6);
        Passenger pass3 = new Passenger("Нео", 180, 36, 75, 6);
        Passenger pass4 = new Passenger("Тринити", 172, 32, 54, 6);
        Passenger pass5 = new Passenger();

        bus.hiSpeech();
        bus.run(40);
        bus.stop();

        bus.run(50);
        bus.stop();
        pass1.getInBus();
        dog.getInBus(pass1);

        bus.run(60);
        pass1.getOutBus();
        dog.getOutBus(pass1);
        pass2.getInBus();
        pass3.getInBus();
        pass4.getInBus();
        pass5.getInBus();
        bus.stop();

        bus.run(60);
        bus.stop();


        bus.run(60);
        bus.stop();

        bus.run(70);
        bus.stop();
        pass2.getOutBus();
        pass3.getOutBus();
        pass4.getOutBus();
        pass5.getOutBus();

        //При описании классов их следует разместить по пакетам и добавить описание методов (javadoc)
    }
}

