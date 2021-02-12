package Composition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseRoomTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    void testThatValueInTheConstructorsAreTheSame(){
        //given that
        HouseRoom newRoom = new HouseRoom("chair", "table", "fan", "Television", "bed", "cupBoard");
        assertNotNull(newRoom);
    }
}