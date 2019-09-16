package maatila;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Maatila {

    private String omistaja;
    private Navetta navetta;
    private List<Lehma> lehmat;

    public Maatila(String omistaja, Navetta navetta) {
        this.omistaja = omistaja;
        this.navetta = navetta;
        this.lehmat = new ArrayList<>();
    }

    public String getOmistaja() {
        return omistaja;
    }

    public void lisaaLehma(Lehma lehma) {
        lehmat.add(lehma);
    }

    public void eleleTunti() {
        for (Lehma lehma : lehmat) {
            lehma.eleleTunti();
        }
    }

    public void hoidaLehmat() {
        navetta.hoida(lehmat);
    }

    public void asennaNavettaanLypsyrobotti(Lypsyrobotti lypsyrobotti) {
        navetta.asennaLypsyrobotti(lypsyrobotti);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Maatilan omistaja: ");
        sb.append(omistaja);
        sb.append("\n");

        sb.append("Navetan maitosäiliö: ");
        sb.append(navetta.getMaitosailio());
        sb.append("\n");

        if (lehmat.isEmpty()) {
            sb.append("Ei lehmiä.");
        } else {
            sb.append("Lehmät:\n");

            for (Lehma lehma : lehmat) {
                sb.append("        ");
                sb.append(lehma);
                sb.append("\n");
            }
        }

        return sb.toString();
    }
}
