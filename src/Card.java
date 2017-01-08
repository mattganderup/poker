/**
 * Created by matt.ganderup on 1/7/2017.
 */
public class Card {

    String rank;
    String suit;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    public String toString() {
        return rank + suit;
    }

}
