package day1;

public class CarTest {
    public static void main(String[] args) {
        Car Car1 = new Car();
        Car1.setBrand("Mercedes E200");
        Car1.setLicense("50A-23678");
        Car1.setWheel(4);
        Car1.setDoor(4);
        Car1.setEngine("I4 Turbo");
        Car1.setSeat(5);
        System.out.println("Brand: " + Car1.brand);
        System.out.println("License: " + Car1.license);
        System.out.println("Wheel: " + Car1.wheel);
        System.out.println("Door: " + Car1.door);
        System.out.println("Engine: " + Car1.engine);
        System.out.println("Seat: " + Car1.seat);

        Car Car2 = new Car();
        Car2.setBrand("Bugatti Chiron");
        Car2.setLicense("20A-57853");
        Car2.setWheel(4);
        Car2.setDoor(2);
        Car2.setEngine("W16 Quad-Turbo");
        Car2.setSeat(2);
        System.out.println("Brand: " + Car2.brand);
        System.out.println("License: " + Car2.license);
        System.out.println("Wheel: " + Car2.wheel);
        System.out.println("Door: " + Car2.door);
        System.out.println("Engine: " + Car2.engine);
        System.out.println("Seat: " + Car2.seat);
    }
}
