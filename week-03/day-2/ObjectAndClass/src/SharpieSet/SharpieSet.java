package SharpieSet;

import java.util.ArrayList;
import java.util.List;

/*
    Reuse your Sharpie class
    Create SharpieSet class
        it contains a list of Sharpie
        countUsable() -> sharpie is usable if it has ink in it
        removeTrash() -> removes all unusable sharpies
 */
public class SharpieSet {
    List<Sharpie> aCoupleOfSharpies;

    public SharpieSet (){

        this.aCoupleOfSharpies = new ArrayList<>();
    }

    public void add (Sharpie aSharpie){
        aCoupleOfSharpies.add(aSharpie);
    }

    public int countUsable (){
        int counter = 0;
        for(Sharpie sharpie : aCoupleOfSharpies)
        if (sharpie.inkAmount > 0){
            counter++;
        }
        return counter;
    }

    public void removeTrash() {
        for (Sharpie sharpie : aCoupleOfSharpies) {
            if (sharpie.inkAmount == 0) {
                aCoupleOfSharpies.remove(sharpie);
            }
        }
    }

    @Override
    public String toString (){
        return aCoupleOfSharpies.toString();
    }


}
