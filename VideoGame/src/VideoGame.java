import java.util.Random;

public class VideoGame extends AlienFactory {
    private static final int ALIENGANG = 10;
    public void play(){
        Alien [] alien = new Alien[10];
        AlienFactory af = new AlienFactory();

        for(int i=0;i<alien.length;i++){
            alien[i]=af.getAlien();
        }
        for (Alien a:alien ){
            System.out.println(a);
        }
    }
}

