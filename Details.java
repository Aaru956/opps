public class Details {

    String name;
    int age;

    public Person() {
        name = "Unknown";
        age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Alice", 30);

        p1.displayInfo();
        System.out.println();
        p2.displayInfo();
    }
}
