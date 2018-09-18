package less_5.transport;

public enum BusStops {
    DEPARTURE(0,"Автовокзал"), ST_1(1, "ЦУМ"), ST_2(2, "ул. Аэрофлотская"), ST_3(3, "ул. Малиновского"), ST_4(4, "ул. Б.Хмельницкого"), ST_5(5, "Автобазар"), DESTINANION(6, "ж/м Северный");

    private int index;
    private String stopName;

    BusStops(int index, String stopName) {
        this.index = index;
        this.stopName = stopName;
    }

    public int getIndex() {
        return index;
    }

    public String getStopName() {
        return stopName;
    }
}
