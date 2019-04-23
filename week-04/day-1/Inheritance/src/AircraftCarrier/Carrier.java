package AircraftCarrier;

import java.util.ArrayList;

public class Carrier {
    ArrayList<Aircraft> airCrafts;
    int ammoStorage;
    int healthPoint;

    public Carrier(){

    }

    public Carrier(int ammoStorage, int HP){
        this.airCrafts = new ArrayList();
        this.ammoStorage = ammoStorage;
        this.healthPoint = healthPoint;
    }

    public ArrayList addAirCraft(Aircraft anAirCraft){
        airCrafts.add(anAirCraft);
        return airCrafts;
    }

    public int fillAllAirCrafts(Aircraft aircraft){
        for(Aircraft anAircraft : airCrafts){
            int Total = anAircraft.maxAmmo* airCrafts.size();
            if (ammoStorage >= Total) {
                anAircraft.refill(200);
            }else {

            }
        }
    }
}
