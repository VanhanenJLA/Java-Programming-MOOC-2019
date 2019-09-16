/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jouni
 */
public enum Koulutus {
    FT("tohtori"),
    FM("maisteri"),
    LuK("kandidaatti"),
    FilYO("ylioppilas");

    private String koulutus;

    private Koulutus(String koulutus) {
        this.koulutus = koulutus;
    }

    public String getKoulutus() {
        return koulutus;
    }

}
