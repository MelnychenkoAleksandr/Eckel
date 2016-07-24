package reusing;
import static net.mindview.Print.*;
/**
 * Created by alex on 19.07.16.
 */
class Homer{
    char doh(char c){
        print("doh(char)");
        return 'd';
    }
    float doh(float f){
        print("doh(float)");
        return 1.0f;
    }
}
class Milhouse{}

class Bart extends Homer{
    void doh(Milhouse m){
        print("doh(Milhouse)");
    }
}

public class Hide {
    public static void main(String[] args) {
        Bart b = new Bart();
        b.doh(1);
        b.doh('h');
        b.doh(1.0f);
        b.doh(new Milhouse());
    }
}
