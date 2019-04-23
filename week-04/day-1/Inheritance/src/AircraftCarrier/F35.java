package AircraftCarrier;

public class F35 extends Aircraft{

    public F35(){
        super(12,50,0);

    }

    public int refill(int amount) {
        return super.refill(12);
    }

    public int fight(){
        return super.fight();
    }
}
