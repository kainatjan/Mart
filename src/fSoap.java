import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kainat on 4/20/2017.
 */
public class fSoap{
    List<GroosryItems> Soap = new ArrayList<GroosryItems>();

    public fSoap() {
        Soap.add(new DoveSoap());
        Soap.add(new LuxSoap());
    }
}

