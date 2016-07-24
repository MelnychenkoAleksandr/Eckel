package polymorphysm.music3;
import polymorphysm.music.Note;
import static net.mindview.Print.*;
/**
 * Created by alex on 24.07.16.
 */
class Instrument{
    void play(Note n){print("Instrument.play()" + n);}
    String what(){return "Instrument";}
    void adjust(){print("Adjust instrument");}

}
class Wind extends Instrument{
    void play(Note n){print("Wind.play() " + n);}
    String what(){return "Wind";}
    void adjust(){print("Adjust wind");}
}
class Percusion extends Instrument{
    void play(Note n){print("Pecusion.play() " + n);}
    String what(){return "Percusion";}
    void adjust(){print("Adjust.Percusion()");}
}
class Stringed extends Instrument{
    void play(Note n){print("Stringed.play()" + n);}
    String what(){return "Stringed";}
    void adjust(){print("Adjust Stringed");}
}
class Brass extends Wind{
    public void play(Note n){print("Brass.play()" + n);}
    void adjust(){print("Adjust Brass");}
}
class Woodwind extends Wind{
    void play(Note n){print("Woodwind play()" + n);}
    String what(){return "Woodwind";}
}


public class Music3 {
    public static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Instrument [] e){
        for (Instrument i : e)
            tune(i);
    }

    public static void main(String[] args) {
        Instrument[] orcestra = {
                new Wind(),
                new Percusion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orcestra);
    }
}
