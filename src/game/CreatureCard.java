package game;

public class CreatureCard extends Card{
    private int point_degat;
    private int point_vie;

    CreatureCard(String attackCard, int value){

    }

    public CreatureCard(String name, int value, String type){
        this.setName(name);
        this.setValue(value);
        this.setType(type);
    }

    CreatureCard(int point_degat, int point_vie){
        this.point_degat = point_degat;
        this.point_vie = point_vie;
    }


    public int getPoint_degat() {
        return point_degat;
    }

    public void setPoint_degat(int point_degat) {
        this.point_degat = point_degat;
    }

    public int getPoint_vie() {
        return point_vie;
    }

    public void setPoint_vie(int point_vie) {
        this.point_vie = point_vie;
    }
}