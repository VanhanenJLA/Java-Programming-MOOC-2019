
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Muutoshistoria {

    private List<Double> tilanteet;

    public Muutoshistoria() {
        tilanteet = new ArrayList<>();
    }

    public void lisaa(double tilanne) {
        tilanteet.add(tilanne);
    }

    public void nollaa() {
        tilanteet.clear();
    }

    public double minArvo() {
        return Collections.min(tilanteet);
    }

    public double maxArvo() {
        return Collections.max(tilanteet);
    }

    public double keskiarvo() {
        if (tilanteet.isEmpty()) {
            return 0;
        }

        return tilanteet.stream().mapToDouble(d -> d).average().getAsDouble();
    }

    public double suurinMuutos() {
        if (tilanteet.isEmpty()) {
            return 0;
        }

        double suurinTunnettu = 0;

        for (int i = 0; i < tilanteet.size() - 1; i++) {
            double edellinenMuutos = Math.abs(tilanteet.get(i) - tilanteet.get(i + 1));
            if (edellinenMuutos > suurinTunnettu) {
                suurinTunnettu = edellinenMuutos;
            }
        }

        return suurinTunnettu;
    }

    public double varianssi() {
        double ka = keskiarvo();

        double erotustenNelioidenSummat = 0;

        for (int i = 0; i < tilanteet.size(); i++) {
            double luku = tilanteet.get(i);
            double erotus = luku - ka;
            double erotusteNelio = erotus * erotus;
            erotustenNelioidenSummat += erotusteNelio;
        }

        return erotustenNelioidenSummat / (tilanteet.size() - 1);
    }

    @Override
    public String toString() {
        return tilanteet.toString();
    }
}
