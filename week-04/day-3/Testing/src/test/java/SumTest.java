import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class SumTest {
    @Test
    public void testExpectedSumResult(){
        ArrayList<Integer> testNumbers = new ArrayList<>();
        testNumbers.add(3);
        testNumbers.add(3);
        testNumbers.add(3);

        Sum wut = new Sum();


        Assert.assertEquals( 10, wut.getSum(testNumbers));
    }
}
