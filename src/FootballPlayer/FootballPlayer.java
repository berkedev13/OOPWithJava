package FootballPlayer;
public class FootballPlayer {
    int no;
    String name;
    int minutes;
    boolean inPlay;
    int numberOfGoals;

    void play(int minutesToPlay) {
        minutes += minutesToPlay;
    }
    void score() {
        numberOfGoals++;
    }
}
