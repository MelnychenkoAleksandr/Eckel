package reusing;

/**Create a class with a blank final reference to an object. Perform the
 initialization of the blank final inside all constructors. Demonstrate the guarantee that the
 final must be initialized before use, and that it cannot be changed once initialized.
 * Created by alex on 20.07.16.
 */
class Reference{
//    final int i = 9;
    final private String s = "final Private reference ";

    Reference(){

        System.out.println("No argument");
    }
    Reference(int i){

        System.out.println("argument " + i);
    }
    Reference(String s){

        System.out.println(" String argument " + s);
    }
}

public class FinalReference {
    private final Reference r;
    private static final int k = 15;
    private static  final String sr = "String in final reference";
    public FinalReference(int i){
        r = new Reference(i);
    }
    public FinalReference(String s){
        r = new Reference("String");
    }
    public FinalReference(){
        r = new Reference();
    }

    public static void main(String[] args) {
        FinalReference x = new FinalReference();
        FinalReference y = new FinalReference(sr);
        FinalReference z = new FinalReference(k);
    }
}
