package polymorphysm.Excercises;
import static net.mindview.Print.*;
/**Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster,
 etc. In the base class, provide methods that are common to all Rodents, and override these
 in the derived classes to perform different behaviors depending on the specific type of
 Rodent. Create an array of Rodent, fill it with different specific types of Rodents, and call
 your base-class methods to see what happens.
 * Created by alex on 24.07.16.
 */
class Rodent{
    public String name;
    Rodent(String name){
        print("Rodent name is " + name);
    }
    protected void gnaw(){
        print("Rodent gnawing ");
    }
}
class Mouse extends Rodent{
    Mouse(String name){
        super(name);
        print("Mouse name is " + name);
    }
    protected void gnaw(){
        print("Mouse is gnawing");
    }
}
class Gerbil extends Rodent{

    Gerbil(String name){
        super(name);
        print("Gerbil name is " + name);
    }
    protected void gnaw(){
        print("Gerbil is gnawing");
    }
}
class Hamster extends Rodent{

    Hamster(String name){

        super(name);
        print("Hamster name is " + name);
    }
    protected void gnaw(){
        print("Hamster is gnawing");
    }
}

public class Excersise9 {
    public static void main(String[] args) {
        Rodent [] rodents = {
                new Mouse("Mickey"),
                new Mouse("Mini"),
                new Hamster("Brave"),
                new Gerbil("Fluffie")
                };
        for (Rodent r : rodents)
            r.gnaw();
    }
}
