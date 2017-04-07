package homeworks.HW3.cardsdeck;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vahag on 4/7/2017.
 */
public class CardPlayer {
    List<Card> cards;

    public CardPlayer() {
        cards = new ArrayList<>();
    }

    public void getCard(Card card){
        cards.add(card);
    }

    public void showCards(){
        for (Card card: cards) {
            System.out.println(card);
        }
    }
}
