package polymorphysm;
import static net.mindview.Print.*;
/**
 * Created by alex on 24.07.16.
 */
public class PrivateOverride {
    private void f(){print("private f()");}

    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f();
    }
}
class Derived extends PrivateOverride{
    public void f(){print("public f()");}
}
