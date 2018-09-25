package less_6;

import java.util.Objects;

public class Circle extends Line {
    private Line line;

    public Circle() {
        this.line = new Line(new Point(0, 0), new Point(0, 10));
    }

    public Circle(Line line) {
        this.line = line;
    }

    public Circle(Point point1, Point point2) {
        this.line = new Line(point1, point2);
    }

    public Line getLine() {
        return line;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return Objects.equals(getLine(), circle.getLine());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getLine());
    }

    @Override
    public String toString() {
        return "Длинна окружности: " + this.circleLength() + ", площадь круга: " + this.circleArea();
    }

    public double circleLength() {
        double result = Math.PI * 2 * super.length(getPoint2(),getPoint1());
        return result;
    }

    public double circleArea() {
        double result = Math.PI * Math.pow(super.length(getPoint2(),getPoint1()), 2);
        return result;
    }
}
