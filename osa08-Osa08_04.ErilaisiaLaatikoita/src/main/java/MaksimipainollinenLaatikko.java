
import java.util.ArrayList;
import java.util.List;

public class MaksimipainollinenLaatikko extends Laatikko {

    private List<Tavara> tavarat;
    private int maksimipaino;

    public MaksimipainollinenLaatikko(int tilavuus) {
        this.maksimipaino = tilavuus;
        this.tavarat = new ArrayList<>();
    }

    @Override
    public void lisaa(Tavara tavara) {
        if (this.tavaroidenPaino() + tavara.getPaino() > this.maksimipaino) {
            return;
        }

        this.tavarat.add(tavara);
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        return this.tavarat.contains(tavara);
    }

    private int tavaroidenPaino() {
        return this.tavarat.stream().mapToInt(t -> t.getPaino()).sum();
    }
}
