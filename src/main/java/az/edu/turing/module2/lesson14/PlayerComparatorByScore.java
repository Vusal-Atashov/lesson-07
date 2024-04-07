package az.edu.turing.module2.lesson14;

import java.util.Comparator;

public class PlayerComparatorByScore implements Comparator<Player> {

    @Override
    public int compare(Player player1, Player player2) {
//        return -(player1.getScore()<player2.getScore()?-1:player1.getScore()==player2.getScore()?0:1);
        // return player1.getScore() - player2.getScore();
        //return Long.compare(player1.getScore(),player2.getScore());
        return player2.getScore() > player1.getScore()
                ? 1 : player2.getScore() < player1.getScore()
                ? -1 : player1.getName().compareTo(player2.getName())
                != 0 ? player1.getName().compareTo(player2.getName())
                : -Long.compare(player1.getId(), player2.getId());
    }
}
