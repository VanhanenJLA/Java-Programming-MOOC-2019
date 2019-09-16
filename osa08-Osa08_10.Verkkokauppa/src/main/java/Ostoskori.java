/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jouni
 */
import java.util.*;

public class Ostoskori {

    private Map<String, Ostos> ostokset;

    public Ostoskori() {
        this.ostokset = new HashMap<>();
    }

    public int hinta() {
        int hinta = 0;
        for (Ostos ostos : ostokset.values()) {
            hinta += ostos.hinta();
        }

        return hinta;
    }

    public void lisaa(String tuote, int hinta) {
        this.ostokset.putIfAbsent(tuote, new Ostos(tuote, 0, hinta));
        this.ostokset.get(tuote).kasvataMaaraa();
    }

    public void tulosta() {
        for (Ostos ostos : ostokset.values()) {
            System.out.println(ostos);
        }
    }
}
