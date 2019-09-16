
import java.util.ArrayList;

public class TulostaRajatut {

    public static void main(String[] args) {
        // kokeile toteuttamasi metodin toimintaa täällä
    }

    public static void tulostaRajatutLuvut(ArrayList<Integer> luvut, int alaraja, int ylaraja) {
        System.out.println("Luvut välillä [" + alaraja + "," + ylaraja);
        for (Integer integer : luvut) {
            if (integer >= alaraja) {
                if (integer <= ylaraja) {
                    System.out.println(integer);
                }
            }
        }

    }
}
