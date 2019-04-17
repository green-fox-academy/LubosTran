package PetroStation;
/*
    Create Station and Car classes
    Station
        gasAmount
        refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount
    Car
        gasAmount
        capacity
        create constructor for Car where:
            initialize gasAmount -> 0
            initialize capacity -> 100

 */
public class Main {
    public static void main(String[] args) {
        Car aCar = new Car("BMW");
        Station aStation = new Station();

        aStation.refill(aCar);
        System.out.println(aStation.gasAmount);
        System.out.println(aCar.gasAmount);
    }
}
