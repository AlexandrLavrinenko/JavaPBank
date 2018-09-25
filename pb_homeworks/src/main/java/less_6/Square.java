package less_6;

import java.util.Objects;

public class Square extends Line {
    private Point point1, point2, point3, point4;

    public Square() {
        this.point1 = new Point();
        this.point2 = new Point(0, 10);
        this.point3 = new Point(10, 10);
        this.point4 = new Point(10, 0);
    }

    public Square(Point point1, Point point2, Point point3, Point point4) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
    }

    public Point getPoint3() {
        return point3;
    }

    public Point getPoint4() {
        return point4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        if (!super.equals(o)) return false;
        Square square = (Square) o;
        return Objects.equals(getPoint1(), square.getPoint1()) &&
                Objects.equals(getPoint2(), square.getPoint2()) &&
                Objects.equals(getPoint3(), square.getPoint3()) &&
                Objects.equals(getPoint4(), square.getPoint4());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPoint1(), getPoint2(), getPoint3(), getPoint4());
    }

    @Override
    public String toString() {
        return "Периметр квадрата: " + this.squarePerimeter() + ", площадь: " + this.squareArea();
    }

    public double squarePerimeter() {
        double result = (super.length(getPoint2(),getPoint1()) + super.length(getPoint4(),getPoint3())) * 2;
        return result;
    }

    public double squareArea() {
        double result = super.length(getPoint2(),getPoint1()) * super.length(getPoint4(),getPoint3());
        return result;
    }
}
