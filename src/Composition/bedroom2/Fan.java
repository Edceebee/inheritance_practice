package Composition.bedroom2;

public class Fan {
    private boolean isOn;
    private String colour;

    public Fan(boolean isOn, String colour) {
        this.isOn = isOn;
        this.colour = colour;
    }

    public boolean isOn() {
        return false;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
