
public class Race {

    Car[] cars;
    int distance;
    int maxLength = 0;

    public Race(Car[] cars, int distance) {
        this.cars = cars;
        this.distance = distance;
    }

    public void start() {

        while (true) {
            for (int i = 0; i < cars.length; i++) {
                cars[i].move();
                if (cars[i].position >= distance) {
                    System.out.println("The race is over !!! ");
                    for (int j = 0; j < cars.length; j++) {
                        if (cars[i].position > maxLength) {
                            maxLength = cars[i].position;
                            System.out.println("The car " + cars[i].name + " went the biggest distance, its distance is "
                                    + cars[i].position + " it is the winner !!!");
                        }
                        return;
                    }
                }
            }
        }
    }
}
