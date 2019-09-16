
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jouni
 */
public class Lyhenteet {

    public Lyhenteet() {
        lyhenteet = new HashMap();
    }

    Map<String, String> lyhenteet;

    public void lisaaLyhenne(String lyhenne, String selite) {
        lyhenteet.putIfAbsent(lyhenne, selite);
    }

    public boolean onkoLyhennetta(String lyhenne) {
        return lyhenteet.containsKey(lyhenne);
    }

    public String haeLyhenne(String lyhenne) {
        if (onkoLyhennetta(lyhenne)) {
            return lyhenteet.get(lyhenne);
        }
        return null;
    }
}
