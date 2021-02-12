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
    private String television;
    private  String bed;
    private  String cupBoard;

    public HouseRoom(String chair, String table, String fan, String television, String bed, String cupBoard) {

        this.chair = chair;
        this.table = table;
        this.fan = fan;
        this.television = television;
        this.bed = bed;
        this.cupBoard = cupBoard;
    }

}
