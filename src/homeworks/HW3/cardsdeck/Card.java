package homeworks.HW3.cardsdeck;

/**
 * Created by Vahag on 4/7/2017.
 */
public class Card {
    String suit;
    String faceValue;

    public Card(String suit, String faceValue) {
        if(suit != "Hearts" && suit != "Diamonds" && suit != "Spades" && suit != "Clubs"){
            throw new IllegalArgumentException();
        }
        if(faceValue != "Ace" && faceValue != "King" && faceValue != "Queen" && faceValue != "Jack" && faceValue != "10" &&
                faceValue != "9" && faceValue != "8" && faceValue != "7" && faceValue != "6" &&
                faceValue != "5" && faceValue != "4" && faceValue != "3" && faceValue != "2"){
            throw new IllegalArgumentException();

        }

        this.suit = suit;
        this.faceValue = faceValue;
    }

    @Override
    public String toString() {
        return "Card{ " + suit + ", " + faceValue + "}";
    }
}
