package less_6;

import java.util.Objects;

public class Line extends Point {
    private Point point1;
    private Point point2;

    public Line() {
        this.point1 = new Point(15,0);
        this.point2 = new Point(0, 0);
    }

    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Line)) return false;
        if (!super.equals(o)) return false;
        Line line = (Line) o;
        return Objects.equals(getPoint1(), line.getPoint1()) &&
                Objects.equals(getPoint2(), line.getPoint2());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPoint1(), getPoint2());
    }

    @Override
    public String toString() {
        return "Длинна отрезка: " + this.length(point2, point1);
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public double length(Point point2, Point point1) {
        double lengthX = Math.pow(point2.getX() - point1.getX(), 2);
        double lengthY = Math.pow(point2.getY() - point1.getY(), 2);
        double result = Math.sqrt(lengthX + lengthY);
        return result;
    }
}
