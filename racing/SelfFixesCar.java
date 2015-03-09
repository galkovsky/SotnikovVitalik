
public class SelfFixesCar extends Car {

    @Override
    public void move() {
        super.move();
    }

    @Override
    public int breakCar(int speed) {
        if ((Math.random() * 100) > 90) {
            System.out.println("The car " + name + " is broken but it can fix itself, and it keeps going");
        } else {
            this.speed = speed;
        }
        return speed;
    }
}
