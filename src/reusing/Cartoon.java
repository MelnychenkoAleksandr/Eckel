package reusing;
import static net.mindview.Print.*;
/**
 * Created by alex on 15.07.16.
 */
class Art{
    Art() {print("Art constructor");}
}

class Drawing extends Art{
    Drawing(){print("Drawing constructor");}
}
public class Cartoon extends Drawing{
//    public Cartoon() {print("Cartoon constructor");}

    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}
