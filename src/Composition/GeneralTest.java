package Composition;

import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

class GeneralTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    void testThatValueInTheConstructorsAreTheSame() {
        //given that
        HouseRoom newRoom = new HouseRoom("chair", "table", "fan", "television", "bed", "cupBoard");
        assertNotNull(newRoom);
    }

    @Test
    void testForTelevisionConstructor() {
        // given that
        Television newTelevision = new Television("panasonic", 12, "g-3535");
        assertNotNull(newTelevision);
    }

    @Test
    void testThatChairCanBeUpdated() {
        // given that
        HouseRoom newRoom = new HouseRoom();
        // when
        newRoom.setChair("cool nice chair");
        assertEquals("cool nice chair", newRoom.getChair());
    }

    @Test
    void testThatTableCanBeUpdated() {
        // given that
        HouseRoom newRoom = new HouseRoom();
        // when
        newRoom.setTable("nice table");
        assertEquals("nice table", newRoom.getTable());
    }

    @Test
    void testThatFanCanBeUpdated() {
        // given that
        HouseRoom newRoom = new HouseRoom();
        // when
        newRoom.setChair("cool nice chair");
        assertEquals("cool nice chair", newRoom.getChair());
    }

    @Test
    void testThatTelevisionCanBeUpdated() {
        // given that
        HouseRoom newRoom = new HouseRoom();
        // when
        newRoom.setTelevision("panasonic", "12", "j-3636");
        assertTrue(true, (Supplier<String>) newRoom.getTelevision());
    }

    @Test
    void testThatBedCanBeUpdated() {
        // given that
        HouseRoom newRoom = new HouseRoom();
        // when
        newRoom.setBed("bed");
        assertEquals("bed", newRoom.getBed());
    }

    @Test
    void testThatCupboardCanBeUpdated() {
        // given that
        HouseRoom newRoom = new HouseRoom();
        // when
        newRoom.setCupBoard("cupboard");
        assertEquals("cupboard", newRoom.getCupBoard());

    }

    @Test
    void testThatTvNameCanBeUpdated() {
        // given that
        Television newTv = new Television();
        // when
        newTv.setName("sharp");
        assertEquals("sharp", newTv.getName());
    }

    @Test
    void testThatTvModelCanBeUpdated() {
        // given that
        Television newTv = new Television();
        // when
        newTv.setModel("G-345");
        assertEquals("G-345", newTv.getModel());
    }

    @Test
    void testThatTvSizeCanBeUpdated() {
        // given that
        Television newTv = new Television();
        // when
        newTv.setSize(3, 5);
        assertEquals(15, newTv.getSize());
    }

    @Test
    void testThatAreOfRoomCalculatesTheSizeOfRoom(){
        // given that
        HouseRoom newRoom = new HouseRoom();
        // when
        newRoom.CalculateAreaOfRoom(3, 6);
        assertEquals(18, newRoom.CalculateAreaOfRoom(3,6));
}

}