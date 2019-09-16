
import java.util.Random;

public class Noppa {

    private Random random;
    private int tahkojenMaara;

    public Noppa(int tahkojenMaara) {
        this.random = new Random();
        this.tahkojenMaara = tahkojenMaara;
        // Alusta muuttuja tahkojenMaara tässä
    }

    public int heita() {
        return random.nextInt(tahkojenMaara)+1;
    }
}
