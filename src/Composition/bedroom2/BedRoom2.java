package Composition.bedroom2;

public class BedRoom2 {
    private Fan fan;
    private Bed bed;
    private Chair chair;


    public BedRoom2(Fan fan, Bed bed, Chair chair) {
        this.fan = fan;
        this.bed = bed;
        this.chair = chair;

    }

   // public BedRoom2() {

    //}
    public void makeBed(){
        makeBed();
    }

    public Fan getFan() {
        return fan;
    }

    public void setFan(Fan fan) {
        this.fan = fan;
    }

    public Bed getBed() {
        return bed;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }

    public Chair getChair() {
        return chair;
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
