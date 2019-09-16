
import java.util.Collections;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jouni
 */
public class SamatMaatVierekkainArvojarjestykseen implements Comparator<Kortti> {

    @Override
    public int compare(Kortti k1, Kortti k2) {

        if (!onkoSamanMainen(k1, k2)) {
            return k1.getMaa().getArvo() - k2.getMaa().getArvo();
        }
        if (!onkoSamanArvoinen(k1, k2)) {
            return k1.getArvo() - k2.getArvo();
        }
        return 0;
    }

    private boolean onkoSamanArvoinen(Kortti k1, Kortti k2) {
        return k1.getArvo() == k2.getArvo();
    }

    private boolean onkoSamanMainen(Kortti k1, Kortti k2) {
        return k1.getMaa().getArvo() == k2.getMaa().getArvo();
    }

}
