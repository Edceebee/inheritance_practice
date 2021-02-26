package Composition.bedroom2;

public class Bed {
    private int length;
    private int width;
    private int pillows;

    public Bed(int length, int width, int pillows) {
        this.length = length;
        this.width = width;
        this.pillows = pillows;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getPillows() {
        return pillows;
    }

    public void setPillows(int pillows) {
        this.pillows = pillows;
    }
    public void makeBed(){
        System.out.println("making the bed");
    }
}
