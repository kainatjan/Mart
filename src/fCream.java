import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kainat on 4/20/2017.
 */
public class fCream {
    List<GroosryItems> Cream = new ArrayList<GroosryItems>();

    public fCream() {
        Cream.add(new NiveCream());
        Cream.add(new CareCream());
    }
}
