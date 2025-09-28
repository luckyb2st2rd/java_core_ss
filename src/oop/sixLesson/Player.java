package oop.sixLesson;

public class Player {
    private String name;
    private int personalScore;

    public Player(String name, int points) {
        this.name = name;
        this.personalScore = points;
        GameScore.addPoints(points);
    }

    public String getName() {
        return name;
    }

    public int getPersonalScore() {
        return personalScore;
    }
}
