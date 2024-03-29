/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jouni
 */
import java.util.ArrayList;
import java.util.List;

public class Lauma implements Siirrettava {

    private List<Siirrettava> lauma;

    public Lauma() {
        this.lauma = new ArrayList<>();
    }

    public void lisaaLaumaan(Siirrettava s) {
        this.lauma.add(s);
    }

    @Override
    public void siirra(int dx, int dy) {
        for (Siirrettava siirrettava : lauma) {
            siirrettava.siirra(dx, dy);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Siirrettava siirrettava : lauma) {
            sb.append(siirrettava.toString()).append("\n");
        }

        return sb.toString();
    }
}
