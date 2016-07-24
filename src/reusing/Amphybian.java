package reusing;

/**(2) Create a class called Amphibian. From this, inherit a class called
 Frog. Put appropriate methods in the base class. In main( ), create a Frog and upcast it to
 Amphibian and demonstrate that all the methods still work.
 * Created by alex on 19.07.16.
 */
public class Amphybian {
    void swim(){
        System.out.println("Amphybia swim");
    }
    void liveUnderWater(){
        System.out.println("Amphybia live");
    }
    protected void holdBreath(){
        System.out.println("Amphybia hold brething");
    }
    public String toString(){
        return "I am Amphybia";
    }
}
