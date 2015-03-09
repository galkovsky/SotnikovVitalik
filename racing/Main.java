
public class Main {

    public static void main(String[] args) {

        Car[] cars = {new Car(), new SelfFixesCar(), new Car(), new SelfFixesCar()};
        Race myRace = new Race(cars, 1000);
        myRace.start();
    }
}
