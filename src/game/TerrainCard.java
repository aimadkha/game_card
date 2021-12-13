package game;

public class TerrainCard extends Card{
    private String color;

    public TerrainCard(String name, int value, String type){
        this.setName(name);
        this.setValue(value);
        this.setType(type);

    }

    TerrainCard(){

    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}