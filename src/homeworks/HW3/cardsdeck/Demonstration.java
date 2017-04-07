package homeworks.HW3.cardsdeck;

/**
 * Created by Vahag on 4/7/2017.
 */
public class Demonstration {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        CardPlayer cardPlayer = new CardPlayer();
        for (int i = 0; i < 5; i++) {
            cardPlayer.getCard(deck.deal());
        }
        cardPlayer.showCards();
    }
}
