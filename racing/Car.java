
import java.util.Scanner;

public class Car {

    Scanner scn = new Scanner(System.in);

    int position = 0;
    int nos = 20;
    int speed = 20;
    String name;

    public Car() {

        System.out.println("Name your car");
        name = scn.nextLine();
    }

    public String toString() {
        return "Car with name : " + name;
    }

    public void move() {
        position += speed + breakCar(speed);
        if ((Math.random() * 100) > 80) {
            position += speed + nos + breakCar(speed);
            System.out.println("The car " + name + " is using a NOS, it is going faster.");
        } else {
            position += speed + breakCar(speed);
        }
    }

    public int breakCar(int speed) {
        if ((Math.random() * 100) > 90) {
            speed -= 20;
            System.out.println("The car " + name + " is broken and it is slowing down");
        } else {
            this.speed = speed;
        }
        return speed;
    }
}


