package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static controller.BlackJackGame.ADDITIONAL_DRAW_COUNT;
import static controller.BlackJackGame.INITIAL_DRAW_COUNT;
import static org.assertj.core.api.Assertions.assertThat;

public class BlackJackGameUserTest {
    public static final String PLAYER_NAME = "DD";
    CardHand bustHand = new CardHand();
    CardHand notBustHand = new CardHand();
    BettingMoney bettingMoney = new BettingMoney("100");
    Deck bustDeck;
    Deck notBustDeck;

    @BeforeEach
    void init_field() {
        bustHand.addCard(new Card(Symbol.KING, Type.DIAMOND));
        bustHand.addCard(new Card(Symbol.QUEEN, Type.DIAMOND));
        bustHand.addCard(new Card(Symbol.JACK, Type.DIAMOND));
        notBustHand.addCard(new Card(Symbol.KING, Type.DIAMOND));
        notBustHand.addCard(new Card(Symbol.JACK, Type.DIAMOND));
        bustDeck = new Deck(bustHand);
        notBustDeck = new Deck(notBustHand);
    }

    @Test
    @DisplayName("딜러 이름 테스트")
    void dealer_Name() {
        BlackJackGameUser dealer = new Dealer(notBustDeck, INITIAL_DRAW_COUNT);
        assertThat(dealer.getName()).isEqualTo("딜러");
    }

    @Test
    @DisplayName("이름을 불러오는 지 테스트")
    void name_Test() {
        Player player = new Player(PLAYER_NAME, bettingMoney, notBustDeck, INITIAL_DRAW_COUNT);
        assertThat(player.getName()).isEqualTo(PLAYER_NAME);
    }

    @Test
    @DisplayName("21을 넘는 지")
    void isBust_Player_Test() {
        Player player = new Player(PLAYER_NAME, bettingMoney, bustDeck, INITIAL_DRAW_COUNT);
        player.drawCard(bustDeck, ADDITIONAL_DRAW_COUNT);
        assertThat(player.isBust()).isTrue();
    }
}
