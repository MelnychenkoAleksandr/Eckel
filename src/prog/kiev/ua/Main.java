package prog.kiev.ua;

import static prog.kiev.ua.Circle.count;

/**
 * Created by alex on 17.07.16.
 */
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(2.7);
        Circle cirk1 = new Circle();
        Circle cirk2 = new Circle();
        System.out.println(circle + " " + count);
    }
}
