
import java.util.HashMap;
import java.util.Map;

public class Ohjelma {

    public static void main(String[] args) {
        // Testaa ohjelmasi toimintaa täällä!
    }

    public static void tulostaAvaimet(HashMap<String, String> hajautustaulu) {
        for (Map.Entry<String, String> entry : hajautustaulu.entrySet()) {
            String key = entry.getKey();
            System.out.println(key);
        }
    }

    public static void tulostaAvaimetJoissa(HashMap<String, String> hajautustaulu, String merkkijono) {
        for (Map.Entry<String, String> entry : hajautustaulu.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            if (key.contains(merkkijono)) {
                System.out.println(key);
            }
        }
    }

    public static void tulostaArvotJosAvaimessa(HashMap<String, String> hajautustaulu, String merkkijono) {
        for (Map.Entry<String, String> entry : hajautustaulu.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            if (key.contains(merkkijono)) {
                System.out.println(value);
            }
        }
    }

}
