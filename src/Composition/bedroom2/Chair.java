package Composition.bedroom2;

public class Chair {
    private String colour;
    private int legs;

    public Chair(String colour, int legs) {
        this.colour = colour;
        this.legs = legs;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}
