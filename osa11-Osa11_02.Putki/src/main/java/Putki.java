
import java.util.Queue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jouni
 */
public class Putki<T> {

    Queue<T> jono;

    public void lisaaPutkeen(T arvo) {
        this.jono.add(arvo);
    }

    public T otaPutkesta() {
        return jono.poll();
    }

    public boolean onkoPutkessa() {
        return jono.isEmpty();
    }
}
