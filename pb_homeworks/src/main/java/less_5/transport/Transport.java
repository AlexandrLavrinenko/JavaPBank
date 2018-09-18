package less_5.transport;

public class Transport {
    protected int currentSpeed, passPlaces;
    protected String mark, color;

    public Transport(){
        this.mark = "Газель";
        this.color = "Белый";
    }

    public Transport(String mark, String color, int passPlaces){
        setMark(mark);
        setColor(color);
        this.passPlaces = passPlaces;
    }

    public void run(int speed) {
        setCurrentSpeed(speed);
    }

    public void stop() {
        setCurrentSpeed(0);
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}

