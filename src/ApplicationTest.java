import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by matt.ganderup on 1/7/2017.
 */
public class ApplicationTest {

    @Test
    public void testRemoveCard() {
        Deck deck = new Deck();
        Assert.assertEquals(52, deck.getRemainingCardCount());
        deck.getNextCard();
        Assert.assertEquals(51, deck.getRemainingCardCount());
    }

}
