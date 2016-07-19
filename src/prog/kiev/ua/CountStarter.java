package prog.kiev.ua;

import static prog.kiev.ua.CircleCounter.circleCounter;

/**
 * Created by alex on 18.07.16.
 * Написать класс, который умеет считать
 количество созданных объектов этого класса
 (static).
 */
class CircleCounter {
    public static int circleCounter;
    CircleCounter(){circleCounter++;}

}

public class CountStarter{
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            new CircleCounter();
        }
        System.out.println(circleCounter);
    }
}
