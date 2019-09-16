
import java.util.ArrayList;
import java.util.HashMap;

public class Arvosanarekisteri {

    private HashMap<Integer, Integer> arvosanat;
    private ArrayList<Integer> pisteet;

    public Arvosanarekisteri() {
        this.arvosanat = new HashMap<>();
        this.pisteet = new ArrayList<>();
    }

    public void lisaaArvosanaPisteidenPerusteella(int pisteet) {
        this.pisteet.add(pisteet);
        int arvosana = pisteetArvosanaksi(pisteet);

        int lkm = this.arvosanat.getOrDefault(arvosana, 0);
        this.arvosanat.put(arvosana, lkm + 1);
    }

    public int montakoSaanutArvosanan(int arvosana) {
        return this.arvosanat.getOrDefault(arvosana, 0);
    }

    public double koepisteidenKeskiarvo() {
        int summa = 0;

        for (Integer pisteet : this.pisteet) {
            summa = summa + pisteet;
        }

        return 1.0 * summa / this.pisteet.size();
    }

    public double arvosanojenKeskiarvo() {
        int summa = 0;
        int arvosanoja = 0;

        for (Integer arvosana : this.arvosanat.keySet()) {
            summa = summa + arvosana * this.arvosanat.get(arvosana);
            arvosanoja = arvosanoja + this.arvosanat.get(arvosana);
        }

        return 1.0 * summa / arvosanoja;
    }

    public static int pisteetArvosanaksi(int pisteet) {

        int arvosana = 0;
        if (pisteet < 50) {
            arvosana = 0;
        } else if (pisteet < 60) {
            arvosana = 1;
        } else if (pisteet < 70) {
            arvosana = 2;
        } else if (pisteet < 80) {
            arvosana = 3;
        } else if (pisteet < 90) {
            arvosana = 4;
        } else {
            arvosana = 5;
        }

        return arvosana;
    }
}
