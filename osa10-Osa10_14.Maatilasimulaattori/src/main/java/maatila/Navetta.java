/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maatila;

/**
 *
 * @author Jouni
 */
import java.util.Collection;
import java.util.List;

public class Navetta {

    private Maitosailio maitosailio;
    private Lypsyrobotti lypsyrobotti;

    public Navetta(Maitosailio maitosailio) {
        this.maitosailio = maitosailio;
    }

    public Maitosailio getMaitosailio() {
        return maitosailio;
    }

    public void asennaLypsyrobotti(Lypsyrobotti lypsyrobotti) {
        lypsyrobotti.setMaitosailio(maitosailio);
        this.lypsyrobotti = lypsyrobotti;
    }

    public void hoida(Lehma lehma) {
        if (lypsyrobotti == null) {
            throw new IllegalStateException("Lypsyrobottia ei ole asennettu");
        }

        lypsyrobotti.lypsa(lehma);
    }

    public void hoida(List<Lehma> lehmat) {
        for (Lehma lehma : lehmat) {
            hoida(lehma);
        }
        lehmat.stream().forEach(l -> hoida(l));
    }

    @Override
    public String toString() {
        return maitosailio.toString();
    }
}
