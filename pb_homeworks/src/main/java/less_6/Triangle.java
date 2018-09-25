package less_6;

import java.util.Objects;

public class Triangle extends Line{
    public Point point1,point2,point3;

    public Triangle() {
        this.point1 = new Point(0, 0);
        this.point2 = new Point(0, 10);
        this.point3 = new Point(0, -10);
    }

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        if (!super.equals(o)) return false;
        Triangle triangle = (Triangle) o;
        return Objects.equals(getPoint1(), triangle.getPoint1()) &&
                Objects.equals(getPoint2(), triangle.getPoint2()) &&
                Objects.equals(point3, triangle.point3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPoint1(), getPoint2(), point3);
    }

    @Override
    public String toString() {
        return "Периметр треугаольника: " + this.perimeter();
    }

    public double perimeter() {
        double result = super.length(point3, point2) + super.length(point3, point1) + super.length(point2, point1);
        return result;
    }
}
