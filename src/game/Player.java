package game;

import java.util.ArrayList;

public class Player {

    private String name;
    private int point;
    private Card card;

    public ArrayList<Card> playerCard = new ArrayList<>();

    public Player(String name, int point){
        this.name = name;
        this.point = point;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getPoint()
    {
        return point;
    }

    public void setPoint(int point)
    {
        this.point = point;
    }
}
