/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jouni
 */
public class Elokuva {
    private String nimi;
    private int ikaraja;
    
    public Elokuva(String elokuvanNimi, int elokuvanIkaraja) {
        nimi = elokuvanNimi;
        ikaraja = elokuvanIkaraja;
    }

    public String nimi() {
        return nimi;
    }

    public int ikaraja() {
        return ikaraja;
    }
    
    
}
