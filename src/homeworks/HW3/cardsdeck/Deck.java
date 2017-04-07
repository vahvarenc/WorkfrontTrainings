package homeworks.HW3.cardsdeck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Vahag on 4/7/2017.
 */
public class Deck {
    List<Card> deck;

    public Deck() {
        deck = new ArrayList<>(52);
        List<String> suits = new ArrayList<>();
        suits.add("Hearts");
        suits.add("Diamonds");
        suits.add("Spades");
        suits.add("Clubs");
        List<String> faceValues = new ArrayList<>();
        faceValues.add("Ace");
        faceValues.add("King");
        faceValues.add("Queen");
        faceValues.add("Jack");
        faceValues.add("10");
        faceValues.add("9");
        faceValues.add("8");
        faceValues.add("7");
        faceValues.add("6");
        faceValues.add("5");
        faceValues.add("4");
        faceValues.add("3");
        faceValues.add("2");

        for (String suit : suits) {
            for (String faceValue : faceValues) {
                deck.add(new Card(suit, faceValue));
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(deck);
    }

    public Card deal(){
        return deck.remove(0);
    }
}
