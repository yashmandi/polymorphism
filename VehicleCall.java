public class VehicleCall {
    public static void main(String[] args) {
        Car car = new Car();
        Motor mc = new Motor();

        System.out.println("Car's initial speed: " + car.getSpeed());
        System.out.println("Motorcycle initial speed: " + mc.getSpeed());
        car.speedUp();
        mc.speedUp();
        System.out.println("\nCar speed after: " + car.getSpeed());
        System.out.println("Motocycle speed after: " + mc.getSpeed());
    }
}
