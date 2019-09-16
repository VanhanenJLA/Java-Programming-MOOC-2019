/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jouni
 */
public class Henkilo {
    private String nimi;
    private int ika;

    public Henkilo(String nimi) {
        this.nimi = nimi;
    }
    
    public void tulostaHenkilo() {
        System.out.println(nimi +", ika " + ika);
    }
    
    public int palautaIka() {
        return ika;
    }
    
    public void vanhene() {
        ika++;
    }
    
    
}
