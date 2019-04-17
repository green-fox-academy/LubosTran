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
public class Station {
    String name;
    double gasAmount;

    public Station () {

    }

    public void refill(Car car){
        gasAmount -=  car.capacity;
        car.gasAmount = car.capacity;

    }

}
