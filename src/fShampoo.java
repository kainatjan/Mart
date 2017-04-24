import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kainat on 4/20/2017.
 */
public class fShampoo{
    List<GroosryItems> Shampoo =new ArrayList<GroosryItems>();

    public fShampoo(){
        Shampoo.add(new DoveShampo());
        Shampoo.add(new SunSilkShampo());
    }
}
