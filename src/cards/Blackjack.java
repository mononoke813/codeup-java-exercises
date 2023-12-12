package cards;

public class Blackjack {
    public static void main(String[] args) {
        Deck myDeck = new Deck();

        //shuffle the deck 7 times for optimum randomization
        myDeck.shuffle();
        myDeck.shuffle();
        myDeck.shuffle();
        myDeck.shuffle();
        myDeck.shuffle();
        myDeck.shuffle();
        myDeck.shuffle();

        //return an Object myCard = from myDeck and deal the cards
        PokerCard myCard = myDeck.deal();

        //to see the card
        myCard.flip();
    }
}
