import java.util.ArrayList;
import java.util.List;

/**
 * Created by matt.ganderup on 1/7/2017.
 */
public class Hand {

    List<Card> cards = new ArrayList<>();

    public Hand(Deck deck) {
        cards.add(deck.getNextCard());
        cards.add(deck.getNextCard());
    }

    public String toString() {
        String s = "";
        for(Card card : cards) {
            s += card.toString();
        }
        return s;
    }


}
