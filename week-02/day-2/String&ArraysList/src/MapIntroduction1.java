import java.util.HashMap;

public class MapIntroduction1 {
    public static void main(String[]args) {
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        System.out.println(hm);

        //put some key-value
        hm.put(97,"a");
        hm.put(98,"b");
        hm.put(99,"a");
        hm.put(65,"A");
        hm.put(66,"B");
        hm.put(67,"C");

        //Print all
        System.out.println(hm.keySet());
        System.out.println(hm.values());

        //Add value D with the key 68
        hm.put(68,"D");

        //Print how many key-value pairs are in the map
        System.out.println(hm.size());

        //Print the value that is associated with key 99
        System.out.println(hm.get(99)) ;

        //Remove the key-value pair where with key 97
        hm.remove(97);

        //Print whether there is an associated value with key 100 or not
        System.out.println(hm.containsKey(100));

        hm.clear();
        System.out.println(hm);

    }
}
