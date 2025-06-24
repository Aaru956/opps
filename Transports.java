abstract class Transport {
    abstract void move();
}

class Bus extends Transport {
    @Override
    void move() {
        System.out.println("Bus is moving on the road");
    }
}

class Train extends Transport {
    @Override
    void move() {
        System.out.println("Train is moving on the tracks");
    }
}

public class Transports {
    public static void main(String[] args) {
        Transport bus = new Bus();
        Transport train = new Train();

        bus.move();
        train.move();
    }
}
