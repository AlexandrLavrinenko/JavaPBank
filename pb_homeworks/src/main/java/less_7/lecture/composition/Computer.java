package less_7.lecture.composition;

public class Computer {
    private String name;
    // Composition
    private CdRom cdRom; // = new CdRom(); -- Однократное создание экземпляра класса
    private Hdd hdd;
    private Ram ram;

    public Computer(String name, Hdd hdd, Ram ram) {
        this.name = name;
        this.hdd = hdd;
        this.ram = ram;
    }

    public void readCd(){
        // Проверка наличия экземпляра класса
        if(cdRom == null) {
            cdRom = new CdRom();    // При каждом запуске метода будет создаваться новый экземпляр класса
        }
        cdRom.readCd();
    }
}
