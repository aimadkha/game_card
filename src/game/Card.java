package game;

public class Card {
    private String name;
    private int value;
    private String type;

    Card(){

    }
    Card(String name, int value, String type){
        this.name = name;
        this.value = value;

    }

    public int getValue()
    {
        return value;
    }

    public void setValue(int value)
    {
        this.value = value;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}





