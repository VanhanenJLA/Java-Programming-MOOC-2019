import java.util.ArrayList;
import java.util.HashMap;
 
public class Sanakirja {
 
    private HashMap<String, String> kaannokset;
 
    public Sanakirja() {
        this.kaannokset = new HashMap<>();
    }
 
    public String kaanna(String sana) {
        return this.kaannokset.get(sana);
    }
 
    public void lisaa(String sana, String kaannos) {
        this.kaannokset.put(sana, kaannos);
    }
 
    public ArrayList<String> kaannoksetListana() {
        ArrayList<String> lista = new ArrayList<>();
        for (String avain : this.kaannokset.keySet()) {
            lista.add(avain + " = " + this.kaannokset.get(avain));
        }
 
        return lista;
    }
 
    public int sanojenLukumaara() {
        return this.kaannokset.size();
    }
}