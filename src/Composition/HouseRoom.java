package Composition;

// create a single room of a house using composition
// think about the things that should be included in the room
// maybe physical parts of the house but furniture as well
// add at least one method to access an object via a getter and
// then that object public method
// then add at least one method to hide the object (i.e not using a getter)
// but to access the object used in composition within the main class

public class HouseRoom {
    private String chair;
    private  String table;
    private String fan;
    private Television television;
    private  String bed;
    private  String cupBoard;

    public HouseRoom(String chair, String table, String fan, Television television, String bed, String cupBoard) {

        this.chair = chair;
        this.table = table;
        this.fan = fan;
        this.television = television;
        this.bed = bed;
        this.cupBoard = cupBoard;
    }
   public HouseRoom() {}

    public HouseRoom(String chair, String table, String fan, String television, String bed, String cupBoard) {

    }

   public int CalculateAreaOfRoom(int length, int width){
        int size = length * width;
        return size;
    }

    public String getChair() {
        return chair;
    }

    public void setChair(String chair) {
        this.chair = chair;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public void setFan(String fan) {
        this.fan = fan;
    }

    public void setTelevision(String name, String size, String model) {
        this.television = television;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public void setCupBoard(String cupBoard) {
        this.cupBoard = cupBoard;
    }

    public String getTable() {
        return table;
    }

    public String getFan() {
        return fan;
    }

    public Television getTelevision() {
        return television;
    }

    public String getBed() {
        return bed;
    }

    public String getCupBoard() {
        return cupBoard;
    }
}
