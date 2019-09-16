import java.util.ArrayList;
 
public class Ruokalista {
 
    private ArrayList<String> ateriat;
 
    public Ruokalista() {
        this.ateriat = new ArrayList<>();
    }
 
    // toteuta tänne tarvittavat metodit
    public void lisaaAteria(String ateria) {
        if (!this.ateriat.contains(ateria)) {
            this.ateriat.add(ateria);
        }
    }
 
    public void tulostaAteriat() {
        int indeksi = 0;
        while (indeksi < this.ateriat.size()) {
            System.out.println(this.ateriat.get(indeksi));
            indeksi++;
        }
    }
 
    public void tyhjennaRuokalista() {
        this.ateriat.clear();
    }
}