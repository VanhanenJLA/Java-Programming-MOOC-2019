

import java.util.List;

public class HenkiloTulostus {

    public void tulostaLaitoksenHenkilot(List<Henkilo> hlot) {
        hlot.stream().forEach(h -> System.out.println(h));
    }

}
