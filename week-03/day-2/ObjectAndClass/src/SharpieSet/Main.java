package SharpieSet;

import java.util.List;

/*
    Reuse your Sharpie class
    Create SharpieSet class
        it contains a list of Sharpie
        countUsable() -> sharpie is usable if it has ink in it
        removeTrash() -> removes all unusable sharpies

 */
public class Main {
    public static void main(String[] args) {


        Sharpie one = new Sharpie("blue", 42);
        Sharpie two = new Sharpie("green", 40);
        one.use() ;
        one.use() ;
        one.use() ;
        one.use() ;
        one.use() ;one.use() ;
        one.use() ;
        one.use() ;
        one.use() ;one.use() ;

        SharpieSet aSet = new SharpieSet();
        aSet.add(one);
        aSet.add(two);
        aSet.removeTrash();
        aSet.countUsable();

        System.out.println(one.inkAmount);
        System.out.println(aSet.aCoupleOfSharpies);
        System.out.println(aSet.countUsable());
    }
}
