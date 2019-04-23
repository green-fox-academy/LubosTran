package AircraftCarrier;

public class Aircraft {
    int maxAmmo;
    int baseDamage;
    int ammoStorage;

    public Aircraft(){

    }

    public Aircraft(int maxAmmo, int baseDamage, int ammoStorage){
        this.maxAmmo = maxAmmo;
        this.baseDamage = baseDamage;
        this.ammoStorage = ammoStorage;
    }

    public int fight(){
        ammoStorage -= ammoStorage;
        int damageDealt = baseDamage*ammoStorage;
        return damageDealt;
    }

    public int refill(int amount){
        int neededAmount = maxAmmo - ammoStorage;
        if(ammoStorage < maxAmmo){
            ammoStorage  = maxAmmo;
            amount = neededAmount  ;
        }return amount;
    }

    //problem here
    public String getType(){
        return this.getClass().toString();
    }

    public String getStatus(){
        System.out.println("Type " + getType() + ", Ammo: " + ammoStorage + ", Base Damage: " + baseDamage
                + ", All Damage: " + baseDamage*ammoStorage);
        return getStatus();
    }

    public boolean isPriority(){
        if (getClass().toString() == "F35"){
            return true;
        } else if (getClass().toString() == "F16") {
            return false;
        }
        return isPriority();
    }
}
