package az.edu.turing.module2.lesson14;

import java.util.Objects;

public class Player implements Comparable<Player> {
    private final String name;

    private final int Score;
    private final long id;

    public Player(String name, int score, long id) {
        this.name = name;
        Score = score;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return Score;
    }

    public long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Score == player.Score && id == player.id && Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Score, id);
    }

    @Override
    public String toString() {
        return String.format("{name='%s', Score=%d, id=%d}", name, Score, id);
    }

    @Override
    public int compareTo(Player that) {
        return Long.compare(this.id, that.id);
    }
}