import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kainat on 4/20/2017
 */
public class fRice{
    public List<GroosryItems> Rice = new ArrayList<GroosryItems>();

    public fRice(){
        Rice.add(new SeelaRice());
        Rice.add(new BasmatiRice());
    }

}
