
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jouni
 */
public class Kellari {

    Map<String, ArrayList<String>> kellari;

    public Kellari() {
        kellari = new HashMap();
    }

    public void lisaa(String komero, String tavara) {
        ArrayList lista = new ArrayList();
        lista.add(tavara);

        ArrayList asd = kellari.putIfAbsent(komero, lista);
        if (asd != null) {
            asd.add(tavara);
            kellari.put(komero, asd);
        }

    }

    public ArrayList<String> sisalto(String komero) {
        return kellari.getOrDefault(komero, new ArrayList());
    }

    public void poista(String komero, String tavara) {
        ArrayList tavarat = kellari.get(komero);
        tavarat.remove(tavara);
        if (tavarat.isEmpty()) {
            kellari.remove(komero);
        }
    }

    public ArrayList<String> komerot() {
        ArrayList komerot = new ArrayList();

        kellari.forEach((t, u) -> {
            if (!u.isEmpty()) {
                komerot.add(t);
            }
        });

        return komerot;
    }

}
