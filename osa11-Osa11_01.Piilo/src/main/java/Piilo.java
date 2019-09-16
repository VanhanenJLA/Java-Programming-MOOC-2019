
import java.util.Collection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jouni
 */
public class Piilo<T> {

    private T piilotettu;

    public void laitaPiiloon(T piilotettava) {
        piilotettu = piilotettava;
    }

    public T otaPiilosta() {
        if (onkoPiilossa()) {
            T palautettava = piilotettu;
            piilotettu = null;
            return palautettava;
        }
        return null;
    }

    public boolean onkoPiilossa() {
        return piilotettu == null;
    }

}
