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

public class HukkaavaLaatikko extends Laatikko {

    private List<Tavara> tavarat;

    public HukkaavaLaatikko() {
        this.tavarat = new ArrayList<>();
    }

    @Override
    public void lisaa(Tavara tavara) {
        this.tavarat.add(tavara);
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        return false;
    }
}
