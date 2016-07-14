package reusing;


/**
 * Created by alex on 14.07.16.
 */
class WaterSource{
    String s;
    WaterSource(){
        System.out.println("Water source()");
        s = "Constructed";
    }
    public String toString(){
        return s;
    }
}

public class SprinklerSystem {
    private String valve1, valve2, valve3, valve4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;
    public String toString(){
        return "valve1 = " + valve1 + "\n" +
                "valve2 = " + valve2 + "\n" +
                "valve3 = " + valve3 + "\n" +
                "valve4 = " + valve4 + "\n" +
                "i = " + i + " " + "f = " + f + "\n" +
                "source = " + source;
    }
    public static void main(String[] args){
        SprinklerSystem sprinkler = new SprinklerSystem();
        System.out.println(sprinkler);

    }
}
