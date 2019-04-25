import java.util.ArrayList;

public class Sum {

    ArrayList<Integer> numbers = new ArrayList<>();

    //private List<Integer> numbers;
//
    //public sum(List<Integer>)
    public Sum (){}

    public int getSum(ArrayList<Integer> numbers){

        int addingUp = 0;
        for(int aNumber : numbers){
            addingUp += aNumber;

        }
        return addingUp;
    }
}
