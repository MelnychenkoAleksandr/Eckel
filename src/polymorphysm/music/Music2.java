package polymorphysm.music;
import static net.mindview.Print.*;
import static polymorphysm.music.Note.MIDDLE_C;

/**
 * Created by alex on 24.07.16.
 */
class Stringed extends Instrument{
    public void play(Note n){
        print("Stringed play() " + n);
    }
}
class Brass extends Instrument{
    public void play(Note n){
        print("Brass play " + n);
    }
}

public class Music2 {
    public static void tune(Wind i){
        i.play(Note.MIDDLE_C);
    }
    public static void tune(Stringed i){
        i.play(Note.MIDDLE_C);
    }
    public static void tune(Brass i){
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        Stringed violin = new Stringed();
        Brass frenchHorn = new Brass();
        tune(flute);
        tune(violin);
        tune(frenchHorn);
    }
}
