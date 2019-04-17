package SharpieSet;
/*
    Reuse your Sharpie class
    Create SharpieSet class
        it contains a list of Sharpie
        countUsable() -> sharpie is usable if it has ink in it
        removeTrash() -> removes all unusable sharpies

 */
public class Sharpie {
    String color;
    float width;
    float inkAmount = 100;


    public Sharpie (String color, float width){
        this.color = color;
        this.width = width;
    }

    public void use (){

        this.inkAmount = inkAmount-10;
    }

    @Override
    public String toString (){
        return color +" "+ width;
    }

}

