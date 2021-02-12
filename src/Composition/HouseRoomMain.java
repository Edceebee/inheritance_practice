package Composition;

public class HouseRoomMain {

    public static void main(String[] args) {

        HouseRoom newRoom = new HouseRoom("chair", "table", "fan", "television", "bed", "cupboard");
        Television newTv = new Television();

        newRoom.CalculateAreaOfRoom(4,6);
        //newRoom.getTelevision();
        newTv.setSize(3, 9);
        newTv.getSize();
        newRoom.CalculateAreaOfRoom(2,4);
    }
}
