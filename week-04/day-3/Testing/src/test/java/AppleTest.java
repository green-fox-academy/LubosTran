import org.junit.Assert;
import org.junit.Test;


public class AppleTest {
    @Test
    public void TestIfReturnString (){
        Apple anApple = new Apple();
        String wut = anApple.getApple();
        Assert.assertEquals("apple",wut);
    }
}
