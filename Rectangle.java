class Rectangle {
    int length, width;
    Rectangle() {
        this(1, 1);  
    }
    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    int area() {
        return length * width;
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5, 3);
        System.out.println("r1 area = " + r1.area());
        System.out.println("r2 area = " + r2.area());
    }
}
