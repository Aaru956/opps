public class Demo {
    public static void main(String[] args) {
        Vehicle v = new Car(); // upcasting
        v.display();           // "I am a Car"
        
        if (v instanceof Car) {
            Car c = (Car) v;   // downcasting
            c.display();      // still "I am a Car"
        }
    }
}