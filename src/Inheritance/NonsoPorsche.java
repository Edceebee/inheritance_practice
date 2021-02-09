package Inheritance;

public class NonsoPorsche extends Car{
    private int logo;
    private String colour;

    public NonsoPorsche(String name, int wheels, int weight, int height, String engine, String gear, String steering, int doors, int sideMirrors, int windows, int seats, int logo, String colour) {
        super(name, wheels, weight, height, engine, gear, steering, doors, sideMirrors, windows, seats);
        this.logo = logo;
        this.colour = colour;
    }

    @Override
    public void move() {
        System.out.println("moves by flying");
    }

    @Override
    public void changingGears() {
        System.out.println("change gear automatically");

    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getLogo() {
        return logo;
    }

    public String getColour() {
        return colour;
    }
}

