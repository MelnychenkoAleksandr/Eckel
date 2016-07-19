package prog.kiev.ua;

/**Написать класс «автомобиль», который должен
 уметь заводится, глушить мотор, ехать и держать
 необходимую скорость.
 * Created by aleksandr on 18.07.16.
 */
public class Automobile {
    void startEngine(){
        System.out.println("Engine started");
    }
    void stopEngine(){
        System.out.println("Engine stoped");
    }
    void go(){
        System.out.println("Automobile is going");
    }
    void holdSpeed(int speed){
        System.out.println("Yor current speed is = " + speed + " km/h");
    }


    public static void main(String[] args) {
        Automobile car = new Automobile();
        car.startEngine();
        car.go();
        car.holdSpeed(60);
        car.stopEngine();
    }
}
