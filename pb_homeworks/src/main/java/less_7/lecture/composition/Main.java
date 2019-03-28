package less_7.lecture.composition;

public class Main {
    public static void main(String[] args) {
        Computer comp = new Computer("Asus", new Hdd(), new Ram());
        comp.readCd();
    }
}
