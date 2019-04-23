package TheGardenApplication;

import java.util.ArrayList;

public class TheGarden {
    ArrayList flowers ;
    ArrayList trees ;
    int amountOfWaterGardenHold;

    public TheGarden(){}

    public TheGarden(ArrayList flowers, ArrayList trees, int amountOfWaterGardenHold){
        this.flowers = flowers;
        this.trees=trees;
        this.amountOfWaterGardenHold=amountOfWaterGardenHold;
    }

    public ArrayList addFlower(TheFlower aFlower){
        flowers.add(aFlower);
        return flowers;
    }

    public ArrayList addTree(TheTree aTree){
        trees.add(aTree);
        return trees;
    }

    //public int Water(){
    //    t
    //}
}
