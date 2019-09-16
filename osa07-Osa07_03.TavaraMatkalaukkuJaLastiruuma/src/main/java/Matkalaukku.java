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
 
public class Matkalaukku {
 
    private int maksimipaino;
    private ArrayList<Tavara> tavarat;
 
    public Matkalaukku(int maksimipaino) {
        this.tavarat = new ArrayList<>();
        this.maksimipaino = maksimipaino;
    }
 
    public void lisaaTavara(Tavara tavara) {
        if (this.yhteispaino() + tavara.getPaino() > this.maksimipaino) {
            return;
        }
 
        this.tavarat.add(tavara);
    }
 
    public int yhteispaino() {
        int summa = 0;
        int indeksi = 0;
        while (indeksi < this.tavarat.size()) {
            summa += this.tavarat.get(indeksi).getPaino();
            indeksi++;
        }
        return summa;
    }
 
    public void tulostaTavarat() {
        int indeksi = 0;
        while (indeksi < this.tavarat.size()) {
            Tavara t = this.tavarat.get(indeksi);
            System.out.println(t);
            indeksi++;
        }
    }
 
    public Tavara raskainTavara() {
        if (this.tavarat.isEmpty()) {
            return null;
        }
 
        Tavara raskain = this.tavarat.get(0);
        int indeksi = 0;
        while (indeksi < this.tavarat.size()) {
            Tavara t = this.tavarat.get(indeksi);
            
            if(t.getPaino() > raskain.getPaino()) {
                raskain = t;
            }
            
            indeksi++;
        }
        
        return raskain;
    }
 
    @Override
    public String toString() {
        if (this.tavarat.isEmpty()) {
            return "ei tavaroita (0 kg)";
        }
 
        if (this.tavarat.size() == 1) {
            return "1 tavara (" + this.yhteispaino() + " kg)";
        }
 
        return this.tavarat.size() + " tavaraa (" + this.yhteispaino() + " kg)";
    }
}
