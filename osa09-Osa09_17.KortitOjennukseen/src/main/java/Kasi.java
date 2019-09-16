
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jouni
 */
public class Kasi implements Comparable<Kasi> {

    private List<Kortti> kortit = new ArrayList<>();

    public void lisaa(Kortti kortti) {
        this.kortit.add(kortti);
    }

    public void tulosta() {
        kortit.stream().forEach((t) -> {
            System.out.println(t);
        });
    }

    public void jarjesta() {
        kortit.sort((ekaKortti, tokaKortti) -> {
            return ekaKortti.compareTo(tokaKortti);
        });
    }

    @Override
    public int compareTo(Kasi kasi) {
        return kortit.stream().mapToInt(kortti -> kortti.getArvo()).sum()
                - kasi.kortit.stream().mapToInt(kortti -> kortti.getArvo()).sum();
    }

    public void jarjestaMaittain() {
        Collections.sort(kortit, new SamatMaatVierekkainArvojarjestykseen());
    }

}
