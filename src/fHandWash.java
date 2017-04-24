import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kainat on 4/20/2017.
 */
public class fHandWash{
    List<GroosryItems> HandWash = new ArrayList<GroosryItems>();

    public fHandWash() {
        HandWash.add(new PoundsHandwash());
        HandWash.add(new DetolHandWash());
    }
}
