package AircraftCarrier;

import java.util.ArrayList;

public class Carrier {
    ArrayList airCrafts;
    int CarrierAmmoStorage;
    int HP;

    public Carrier(){

    }

    public Carrier(int ammoStorage, int HP){
        this.airCrafts = new ArrayList();
        this.CarrierAmmoStorage = ammoStorage;
        this.HP = HP;
    }

    public ArrayList addAirCraft(Aircraft anAirCraft){
        airCrafts.add(anAirCraft);
        return airCrafts;
    }

    public int fillAllAirCrafts(){

    }
}
