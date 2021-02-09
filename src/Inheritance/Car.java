package Inheritance;

public class Car  extends Vehicle{

    private int doors;
    private int sideMirrors;
    private int windows;
    private int seats;

    public Car(String name, int wheels, int weight, int height, String engine, String gear, String steering, int doors, int sideMirrors, int windows, int seats) {
        super(name, wheels, weight, height, engine, gear, steering);
        this.doors = doors;
        this.sideMirrors = sideMirrors;
        this.windows = windows;
        this.seats = seats;
    }

    public void move(){
        super.move(3, 5);

    }

    public void stop(){
        super.stop();
    }

    public void handSteering(){
        System.out.println("hand steering called by using hand to turn steering");
    }

    public  void changingGears(){
        System.out.println("changing gear called using manual gears");
    }

    public int getDoors() {
        return doors;
    }

    public int getSideMirrors() {
        return sideMirrors;
    }

    public int getWindows() {
        return windows;
    }

    public int getSeats() {
        return seats;
    }
}
