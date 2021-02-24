/**
 * Created by elham on 2/24/2021.
 */
public class Game {
    private String name;
    private int score;

    public Game(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}

