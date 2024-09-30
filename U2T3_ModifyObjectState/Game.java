package U2T3_ModifyObjectState;

public class Game{
    private String gameName;
    private int players;
    private int score;
    public Game(String gn, int p){
        gameName = gn;
        players = p;
        score = 0;
    }
    public void addPlayer(){
        players++;
    }
    public void increaseScore(int increase){
        score += increase;
    }
    public double averageScorePerPlayer(){
        return score / (double) players;
    }
    public boolean isGameOver(){
        return score > 9;
    }
    public String getGameName(){
        return gameName;
    }
    public int getPlayers(){
        return players;
    }
    public int getScore(){
        return score;
    }
    public void setName(String name){
        gameName = name;
    }
    public void resetScore(int sc){
        score = sc;
    }
}