
import java.util.ArrayList;
import java.util.Random;

public final class Lottorivi {

    private ArrayList<Integer> numerot;

    public Lottorivi() {
        // Arvo numerot heti LottoRivin luomisen yhteydessä
        this.arvoNumerot();
    }

    public ArrayList<Integer> numerot() {
        return this.numerot;
    }

    public void arvoNumerot() {
        // Alustetaan lista numeroille
        this.numerot = new ArrayList<>();

        while (numerot.size() < 7) {
            int numero = arvoNumero();
            if (!sisaltaaNumeron(numero)) {
                numerot.add(numero);
            }
        }
    }

    public int arvoNumero() {
        Random rand = new Random();
        int numero = rand.nextInt(40)+1;
        return numero;
    }

    public boolean sisaltaaNumeron(int numero) {
        return numerot.contains(numero);
    }
}
