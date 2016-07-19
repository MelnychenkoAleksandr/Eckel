package reusing;
import static net.mindview.Print.*;
/**
 * Created by alex on 14.07.16.
 */
class Insect{
    private int i = 9;
    protected int j;
    Insect(){
        print("i = " + i + ", j = " + j);
        j = 39;
    }
    private static int x1 = printInit("Static field Insect x1 initialised");
    static int printInit(String s){
        print(s);
        return(47);
    }
}
public class Beetle extends Insect{
    private int k = printInit("Beetle field k initialised");
    public Beetle(){
        printInit("k = " + k);
        printInit("j = " + j);
    }
    private static int x2 = printInit("Field static Beetle x2 initialised");

    public static void main(String[] args) {
        print("Beetle constructor");
        Beetle b = new Beetle();
    }
}
