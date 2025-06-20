public class Greeting {

    public static void greet(String name, int age) {
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }

    public static void main(String[] args) {
        String name = "Alice";
        int age = 25;

        greet(name, age);
    }
}
