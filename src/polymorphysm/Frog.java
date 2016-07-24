package polymorphysm;
import static net.mindview.Print.*;
/**
 * Created by alex on 24.07.16.
 */
class Characteristic{
    private String s;
    Characteristic(String s){
        this.s = s;
        print("Create Charecteristic " + s);
    }
    protected void dispose(){
        print("Dispose Characteristic " + s);
    }
}
class Description{
    private String s;
    Description(String s){
        this.s = s;
        print("Creatind Description " + s);
    }
    protected void dispose(){
        print("Dispose Description " + s);
    }
}
class LivingCreature{
    private Characteristic p = new Characteristic("Living Creature");
    private Description t = new Description("Base Livingcreature");
    LivingCreature(){
        print("LivingCreature()");
    }
    protected void dispose(){
        print("dispose() in Livingcreature");
        t.dispose();
        p.dispose();
    }
}
class Animal extends LivingCreature{
    private Characteristic p = new Characteristic("has heart");
    private Description t = new Description("Animal not Vegetable");
    Animal(){print("Animal");}
    protected void dispose(){
        print("Animal dispose()");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
class Amphibian extends Animal{
    private Characteristic p = new Characteristic("can live in water");
    private Description t = new Description("Both water and land");
    Amphibian(){
        print("Amphibian()");
    }
    protected void dispose(){
        print("Amphibian dispose()");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}

public class Frog extends Amphibian{
    private Characteristic p = new Characteristic("Croaks");
    private Description t = new Description("Eat bugs");
    public Frog(){print("Frog");}
    protected void dispose(){
        print("dispose Frog");
        t.dispose();
        p.dispose();
        super.dispose();

    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        print("Bye!");
        frog.dispose();
    }
}
