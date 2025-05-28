public class Car extends Vehicle {
    int numberOfSeats;

    public Car(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    void start() {
        System.out.println("Car starts");
    }

    @Override
    void stop() {
        System.out.println("Car stops");
    }
}
