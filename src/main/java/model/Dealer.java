package model;

import java.util.List;

import static controller.BlackJackGame.DEALER_HIT_BOUNDARY;

public class Dealer extends User {
    private static final int FIRST = 0;
    public static final String DEALER_NAME = "딜러";

    public Dealer(Deck deck) {
        super(DEALER_NAME, deck);
    }

    public Dealer(List<Card> cards) {
        super(DEALER_NAME, cards);
    }

    public String toStringCardHandFirst() {
        return cardHand.getCards().get(FIRST).toString();
    }

    @Override
    public boolean isHitBound() {
        return getScore() <= DEALER_HIT_BOUNDARY;
    }
}
