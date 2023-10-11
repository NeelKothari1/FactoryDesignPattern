import java.util.Random;

public class AlienFactory {
    enum alientype {
        Monkey,
        Tiger,
        Rat,
        Squid

    }

    public Alien getAlien() {
        Random rand = new Random();
        int number = rand.nextInt(alientype.values().length);
        Alien answer = null;
        switch (alientype.values()[number]) {

            case Rat:
                answer = new RatAlien();
                break;

            case Monkey:
                answer = new MonkeyAlien();
                break;

            case Squid:
                answer = new SquidAlien();
                break;

            case Tiger:
                answer = new TigerAlien();
                break;
            default:
                System.out.println("No ALien Identified");


        }

        return answer;
    }
}
