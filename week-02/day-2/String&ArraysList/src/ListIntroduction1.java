import java.util.* ;

public class ListIntroduction1 {
    public static void main(String[] args) {
        //String names[] = {"Martin", "Dalibor", "Ales", "Athoney"};
        ArrayList <String> names = new ArrayList<>();
        names.add("William");
        names.add("John");
        names.add("Amanda");
        System.out.println(names.isEmpty());
        System.out.println(names.size());
        System.out.println(names.get(2));

        //for(int i = 0; i < names.size(); i++) {
        //    System.out.println(names.get(i));
        //}
        for(int i = 0; i < names.size(); i++) {

                int j= i+1;
                System.out.println(j + ". " + names.get(i));
            }
        //remove second element
        names.remove(1);
        System.out.println(names);

        //reverse then print each

        for (int i = names.size() -1; i >=0; i--) {
             String name = names.get(i);
            System.out.println(name);
        }

        names.clear();
        System.out.println(names);

    }


}

