package reusing;
import static net.mindview.Print.*;
/**
 * Created by alex on 19.07.16.
 */
class Shape{
    Shape(int i){print("Shape constructor");}
    void dispose(){print("Shape disposed");}
}

class Circle extends Shape{
    Circle(int i){
        super(i);
        print("Drawing circle");
    }
    void dispose(){
        print("Erasing Circle");
        super.dispose();
    }
}

class Triangle extends Shape{
    Triangle(int i){
        super(i);
        print("Triangle constructor");
    }
    void dispose(){
        print("Erasing triangle");
    }
}
class Line extends Shape{
    private int start, end;
    Line(int start, int end){
        super(start);
        this.start = start;
        this.end = end;
        print("Drawing Line: " + start + ", " + end);
    }
    void dispose(){
        super.dispose();
        print("Erasing Line: " + start + ", " + end);
    }
}

public class CADSystem extends Shape{
    private Circle c;
    private Triangle t;
    private Line[] lines = new Line[3];
    public CADSystem(int i){
        super(i + 1);
        for (int j = 0; j < lines.length; j++)
            lines[j] = new Line(j, j*j);
        c = new Circle(1);
        t = new Triangle(1);
        print("Combined constructor");
    }
    public void dispose(){
        print("CADSystem.dispose()");
        t.dispose();
        c.dispose();
        for (int i = lines.length -1; i >=0; i--)
            lines[i].dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        CADSystem x = new CADSystem(47);
        try{

        }
        finally{x.dispose();}
    }
}
