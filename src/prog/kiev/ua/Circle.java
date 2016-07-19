package prog.kiev.ua;

/**
 * Created by alex on 17.07.16.
 * Написать класс Circle (круг) по аналогии с
 Rectangle и метод, который будет возвращать его
 площадь.
 */
public class Circle {
    private double radius;
    public static int count;
    Circle(){count++;}
    void setRadius(Double r){
        this.radius = r;
    }

    Double getRadius(){
        return radius;
    }

    Double countSquare(Double radius){
        return (Math.PI*radius*radius);
    }

    public String toString(){
        return "Radius = " + radius + " square = " + countSquare(radius);
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.setRadius(14.0);
        System.out.println(circle1);
    }
}
