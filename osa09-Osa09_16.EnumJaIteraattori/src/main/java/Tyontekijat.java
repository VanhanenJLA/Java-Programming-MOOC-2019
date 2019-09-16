
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jouni
 */
public class Tyontekijat {

    private List<Henkilo> tyontekijat;

    public Tyontekijat() {
        tyontekijat = new ArrayList<>();
    }

    public void lisaa(Henkilo lisattava) {
        tyontekijat.add(lisattava);
    }

    public void lisaa(List<Henkilo> lisattavat) {
        lisattavat.stream().forEach(henkilo -> tyontekijat.add(henkilo));
    }

    public void tulosta() {
        Iterator<Henkilo> iteraattori = tyontekijat.iterator();
//        while (iteraattori.hasNext()) {
//            System.out.println(iteraattori.next());
//        }
        iteraattori.forEachRemaining(t -> System.out.println(t));
    }

    public void tulosta(Koulutus koulutus) {
        Iterator<Henkilo> iteraattori = tyontekijat.iterator();
        while (iteraattori.hasNext()) {
            Henkilo tyontekija = iteraattori.next();
            if (tyontekija.getKoulutus() == koulutus) {
                System.out.println(tyontekija);
            }
        }

        tyontekijat.stream()
                .forEach(tyontekija -> {
                    if (tyontekija.getKoulutus() == koulutus) {
                        System.out.println(tyontekija);
                    }
                });
    }

    public void irtisano(Koulutus koulutus) {
        tyontekijat = tyontekijat
                .stream()
                .filter(tyontekija -> !samaKoulutus(tyontekija, koulutus))
                .collect(Collectors.toList());
    }

    private boolean samaKoulutus(Henkilo tyontekija, Koulutus koulutus) {
        return tyontekija.getKoulutus() == koulutus;
    }
}
