package cards;
import java.util.ArrayList;

public class Deck {
    public ArrayList<Card> cards;
    public int size;

    public Deck () {
        this.reset();
    }
    public void shuffle() {
        for (int i = 0; i < this.cards.size(); i++) {
            int rand = (int) Math.floor((Math.random() * this.cards.size()));
            Card temp = this.cards.get(i);
            this.cards.set(i, this.cards.get(rand));
            this.cards.set(rand, temp);
        }
    }
    public Card deal() {
        //get a card
        Card dealt = this.cards.get(0);
        this.cards.remove(0);
        this.size--;
        return dealt;
    }
    public void reset() {
        //this is the java constructor public and return Deck - needs to create an array of cards

        this.cards = new ArrayList<Card>();
        String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
        String[] names = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        for (String suit : suits) {
            for (String name : names) {
                Card newCard = new Card(suit, name);
                this.cards.add(newCard);
            }
        }
        this.size = this.cards.size();
        this.shuffle();

    }

}
