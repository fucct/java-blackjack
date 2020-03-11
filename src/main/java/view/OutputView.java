package view;

import controller.BlackJackGame;
import model.Dealer;
import model.Player;
import model.Players;

public class OutputView {

    public static final String DELIMITER = ": ";
    private static final String INITIAL_CARD_COUNT = "2";

    public static void printInitialCards(Players players, Dealer dealer) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("\n")
                .append(dealer.toString())
                .append("와 ")
                .append(players.getNames())
                .append("에게 ")
                .append(INITIAL_CARD_COUNT)
                .append("장의 카드를 나누었습니다.");
        System.out.println(stringBuilder.toString());
    }

    public static void printUsersCard(Players players, Dealer dealer) {
        printDealerCard(dealer);
        printPlayersCard(players);
        System.out.println();
    }

    private static void printPlayersCard(Players players) {
        for (Player player : players.getPlayers()) {
            printPlayerCard(player);
        }
    }

    public static void printPlayerCard(Player player) {
        System.out.println(player.toString() + DELIMITER + player.toStringCardHand());
    }

    private static void printDealerCard(Dealer dealer) {
        System.out.println(dealer.toString() + DELIMITER + dealer.toStringCardHandFirst());
    }

    public static void printDealerDraw(Dealer dealer) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(dealer.toString())
                .append("는 ")
                .append(BlackJackGame.SCORE_BOUNDARY)
                .append("이하라 한장의 카드를 더 받았습니다.");
        System.out.println(stringBuilder.toString());
    }
}
