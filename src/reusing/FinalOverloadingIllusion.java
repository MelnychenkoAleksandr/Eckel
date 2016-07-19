package reusing;
import static net.mindview.Print.*;
/**
 * Created by alex on 14.07.16.
 */

class WithFinals{
    private final void f(){print("With Finals f()");}
    private void g(){print("With Finals g()");}
}

class OverridingPrivate extends WithFinals{
    private void f(){
        print("OverridingPrivate f()");
    }
    private void g(){
        print("OverridingPrivate g()");
    }
}
class OverridingPrivate2 extends OverridingPrivate{
    public void f(){
        print("OverridingPrivate2 f()");
    }
    public void g(){
        print("OverridingPrivate2 g()");
    }
}

public class FinalOverloadingIllusion {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();
        OverridingPrivate op = op2;
//        op.f();
//        op.g();
        WithFinals wf = op2;
//        wf.f();
//        wf.g();
    }
}
