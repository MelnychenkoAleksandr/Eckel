package access;

/**
 * Created by alex on 13.07.16.
 */
class Sundae{
    private Sundae(){}
    static Sundae makeASundae(){
        return new Sundae();
    }
}

public class IceCream {
    public static void main(String[] args) {
        Sundae x = Sundae.makeASundae();
    }
}
