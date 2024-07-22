public class Card {
    public enum Suit {
        PAUS, OURO, COPAS, ESPADAS;
    }

    public enum Rank {
        DOIS(2), TRES(3), QUATRO(4), CINCO(5), SEIS(6), SETE(7), OITO(8), NOVE(9), DEZ(10),
        J(11), Q(12), K(13), A(14);

        private final int value;

        Rank(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private final Suit suit;
    private final Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public int getValue() {
        return rank.getValue();
    }

    @Override
    public String toString() {
        return rank + " DE " + suit;
    }
}
