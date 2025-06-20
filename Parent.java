 class Parent {
    int x = 10;
    Parent(int x) {
        System.out.println("Parent constructor: x = " + x);
    }
}

class Child extends Parent {
    int x = 20;
    Child(int x) {
        super(x);                 // calls parent constructor
        this.x = x;               // assigns to Child.x
        System.out.println("Child constructor: this.x = " + this.x);
    }
    void printBoth() {
        System.out.println("Child.x = " + this.x);
        System.out.println("Parent.x = " + super.x);
    }
}

public class DemoThisSuper {
    public static void main(String[] args) {
        Child c = new Child(30);
        c.printBoth();
    }
}
