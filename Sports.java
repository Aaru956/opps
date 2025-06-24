interface Playable {
    void play();
}

class Football implements Playable {
    @Override
    public void play() {
        System.out.println("Playing football");
    }
}

class Basketball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing basketball");
    }
}

public class Sports {
    public static void main(String[] args) {
        Playable football = new Football();
        Playable basketball = new Basketball();

        football.play();
        basketball.play();
    }
}
