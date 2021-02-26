package Composition.bedroom2;

public class Main {
    public static void main(String[] args) {
        Chair chair = new Chair("brown", 4);
        Bed bed = new Bed(4,6,2);
        Fan fan = new Fan(false, "black");
        BedRoom2 bedRoom2 = new BedRoom2(fan, bed, chair);


    }
}
