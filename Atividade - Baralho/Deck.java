import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private final List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();

        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }

        shuffle();
    }


    public void shuffle() {
        Collections.shuffle(cards);
    }


    public Card darcartas() {
        if (cards.isEmpty()) {
            return null;
        }
        return cards.remove(cards.size() - 1);
    }


    public int cartasresto() {
        return cards.size();
    }

    public List<Card> getCards() {
        return cards;
    }

    @Override
    public String toString() {
        StringBuilder deckString = new StringBuilder();
        for (Card card : cards) {
            deckString.append(card).append("\n");
        }
        return deckString.toString();
    }
}
