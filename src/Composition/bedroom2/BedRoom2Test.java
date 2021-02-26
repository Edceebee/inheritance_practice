package Composition.bedroom2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BedRoom2Test {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testThatConstructorForBedRoomIsNotNull(){
        Chair newChair = new Chair("black", 4);
        Fan newFan = new Fan(false, "black");
        Bed newBed = new Bed(5,6,2);
        BedRoom2 bedRoom = new BedRoom2(newFan, newBed, newChair);
        assertNotNull(bedRoom);
    }
    


}