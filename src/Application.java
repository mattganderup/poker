import java.util.Scanner;

/**
 * Created by matt.ganderup on 1/7/2017.
 */
public class Application {

    public static void main(String[] args) {
        // create a scanner so we can read the command-line input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of players:");

        int numberOfPlayers = scanner.nextInt();
        System.out.println("Playing with " + numberOfPlayers + " players");

        Deck deck = new Deck();
        for(int i = 0; i < numberOfPlayers; i++) {
            Hand hand = new Hand(deck);
            System.out.println(hand);
        }

    }

}
