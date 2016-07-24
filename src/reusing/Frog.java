package reusing;

/**
 * Created by alex on 20.07.16.
 */
public class Frog extends Amphybian {
    void swim(){
        System.out.println("I swim like a frog");
    }
    public String toString(){
        return "I am a frog";
    }
    public static void main(String[] args) {
        Frog frog = new Frog();
        frog.holdBreath();
        frog.liveUnderWater();
        frog.swim();
        System.out.println(frog);
    }
}
