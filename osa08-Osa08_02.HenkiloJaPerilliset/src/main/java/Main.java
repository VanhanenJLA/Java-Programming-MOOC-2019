
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        // tee tänne testikoodia
    }

    public static void tulostaHenkilot(ArrayList<Henkilo> henkilos) {
        henkilos.forEach((t) -> {
            System.out.println(t.toString());
        });
    }
}
