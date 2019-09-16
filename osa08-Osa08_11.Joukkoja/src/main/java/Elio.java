/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jouni
 */
public class Elio implements Siirrettava {

    /*
     * luokalla tulee olla x ja y
     */
    private int x;
    private int y;

    public Elio(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public void siirra(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public String toString() {
        return "x: " + this.x + "; y: " + this.y;
    }
}
