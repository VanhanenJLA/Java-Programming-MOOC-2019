import java.util.ArrayList;
 
public class Kirjasto {
 
    private ArrayList<Kirja> kirjat;
 
    public Kirjasto() {
        this.kirjat = new ArrayList<>();
    }
 
    public void lisaaKirja(Kirja kirja) {
        this.kirjat.add(kirja);
    }
 
    public void tulostaKirjat() {
        for (Kirja kirja : this.kirjat) {
            System.out.println(kirja);
        }
    }
 
    public ArrayList<Kirja> haeKirjaNimekkeella(String nimeke) {
        return haeKirja(nimeke, null, -1);
    }
 
    public ArrayList<Kirja> haeKirjaJulkaisijalla(String julkaisija) {
        return haeKirja(null, julkaisija, -1);
    }
 
    public ArrayList<Kirja> haeKirjaJulkaisuvuodella(int julkaisuvuosi) {
        return haeKirja(null, null, julkaisuvuosi);
    }
 
    // apumetodi
    public ArrayList<Kirja> haeKirja(String nimeke, String julkaisija, int julkaisuvuosi) {
        ArrayList<Kirja> loydetyt = new ArrayList<>();
        for (Kirja kirja : this.kirjat) {
            if (StringUtils.sisaltaa(kirja.nimeke(), nimeke)
                    || StringUtils.sisaltaa(kirja.julkaisija(), julkaisija)
                    || kirja.julkaisuvuosi() == julkaisuvuosi) {
                loydetyt.add(kirja);
            }
        }
 
        return loydetyt;
    }
}