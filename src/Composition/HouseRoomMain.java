package Composition;

public class HouseRoomMain {

    public static void main(String[] args) {

        HouseRoom newRoom = new HouseRoom("chair", "table", "fan", "television", "bed", "cupboard");
        Television newTv = new Television();

        newRoom.CalculateAreaOfRoom(3,6);
        //newRoom.getTelevision();
    }
}
