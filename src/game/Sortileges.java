package game;

public class Sortileges extends Card{
    private String stop;
    private String reverse;

    public Sortileges(String name, int value, String type){
        this.setName(name);
        this.setValue(value);
        this.setType(type);
    }
    public String getStop()
    {
        return stop;
    }

    public void setStop(String stop)
    {
        this.stop = stop;
    }

    public String getReverse()
    {
        return reverse;
    }

    public void setReverse(String reverse)
    {
        this.reverse = reverse;
    }
}
