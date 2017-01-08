import java.util.ArrayList;
import java.util.List;

/**
 * Created by matt.ganderup on 1/7/2017.
 */
public class Deck {

    private List<Card> remainingCards = new ArrayList<>();

    public Deck() {
        String[] ranks = new String[]{"2","3","4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"};
        String[] suits = new String[]{"s", "d", "c", "h"};
        for(String rank : ranks) {
            for(String suit : suits) {
                remainingCards.add(new Card(rank, suit));
            }
        }
    }

    public Card getNextCard() {
        int i = (int)(Math.random() * remainingCards.size());
        return remainingCards.remove(i);
    }

    public int getRemainingCardCount() {
        return remainingCards.size();
    }

}
