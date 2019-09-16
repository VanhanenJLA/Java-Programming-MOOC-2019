
import java.util.HashMap;
import java.util.Map;

public class Ohjelma {

    public static void main(String[] args) {
        // Testaa ohjelmasi toimintaa täällä!
    }
    
    public static void tulostaArvot(HashMap<String, Kirja> hajautustaulu) {
        for (Map.Entry<String, Kirja> entry : hajautustaulu.entrySet()) {
            String key = entry.getKey();
            Kirja value = entry.getValue();
            System.out.println(value.toString());
            
        }
    }
    
    public static void tulostaArvoJosNimessa(HashMap<String, Kirja> hajautustaulu, String merkkijono) {
        for (Map.Entry<String, Kirja> entry : hajautustaulu.entrySet()) {
            String key = entry.getKey();
            Kirja value = entry.getValue();
            
            if (value.getNimi().contains(merkkijono)) {
                System.out.println(value.toString());
            }
            
        }
    }

}
