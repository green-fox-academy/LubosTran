import org.junit.Assert;
import org.junit.Test;

/*public void eat (){
        hunger -= 1;
    }
    public void drink (){
        thirst -= 1;
    }
    public void play (){
        hunger += 1;
        thirst +=1;
    }*/
public class AnimalTest {
    private Animal testSubject = new Animal();

    @Test
    public void hungerDeclining(){

        testSubject.eat();

        Assert.assertEquals(49, testSubject.hunger);
    }

    @Test
    public void thirstDeclining(){

        testSubject.drink();

        Assert.assertEquals(49, testSubject.thirst);
    }

    @Test
    public void hungerAndThirstDeclining(){

        testSubject.play();
        Assert.assertEquals(51, testSubject.hunger);
        Assert.assertEquals(51, testSubject.thirst);
    }
}
