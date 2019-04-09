import java.util.HashMap;

public class MapIntro2 {
    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<>();
        hm.put("978-1-60309-452-8","A Letter to Jo");
        hm.put("978-1-60309-459-7","Lupus");
        hm.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        hm.put("978-1-60309-461-0", "The Lab");

        //for (hm : )
        System.out.println(hm.values() + "(ISBN: " + hm.keySet() + ")");
    }
}
