import javax.annotation.processing.SupportedAnnotationTypes;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kainat on 4/20/2017.
 */
public class fSugar{
     List<GroosryItems> Sugar = new ArrayList<GroosryItems>();

    public fSugar(){
        Sugar.add(new WhiteSugar());
        Sugar.add(new BrownSugar());
    }
}

