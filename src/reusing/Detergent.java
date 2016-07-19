/*(2) Inherit a new class from class Detergent. Override scrub( ) and add a
new method called sterilize( ).*/

package reusing;
import static net.mindview.Print.*;
/**
 * Created by alex on 15.07.16.
 */
class Cleanser {
    private String s = "Cleanser";
    public void append(String a){s+=a;}
    public void dilute(){append(" dilute ");}
    public void apply(){append(" apply ");}
    public void scrub(){append(" csrub ");}

//    public static void main(String[] args) {
//        Cleanser x  =new Cleanser();
//        x.dilute(); x.apply(); x.scrub();
//        print(x);
//
//    }


}


public class Detergent{
    Cleanser clean = new Cleanser();
    public void append(String a){clean.append(a);}
    public void dilute(){clean.dilute();}
    public void apply(){clean.apply();}
    public void scrub() {
        clean.append("Detergent.scrub()");

    }

    public void foam() {
        append(" foam ");
    }

}


class NewDetergent extends Detergent{
        public void scrub(){
            print("A new Detergent scrub()");
        }
        public void sterialize(){
            print("sterialize method in NewDetergent started");
        }


    public static void main(String[] args) {
        NewDetergent x = new NewDetergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        print(x);
        print("Testing base class: ");
//        Cleanser.main(args);
    }


}
