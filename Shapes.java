abstract class Shape {
    abstract double getArea();
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    private double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    double getArea() {
        return side * side;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() {
        return width * height;
    }
}

public class Shapes {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape square = new Square(4);
        Shape rectangle = new Rectangle(3, 6);

        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Square area: " + square.getArea());
        System.out.println("Rectangle area: " + rectangle.getArea());
    }
}
