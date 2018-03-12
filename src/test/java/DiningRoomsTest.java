import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomsTest{

    private DiningRooms diningrooms;
    private Room room;

    @Before
    public void setup(){
        diningrooms = new DiningRooms("Eatery", 10);
    }

    @Test
    public void canGetName(){
        assertEquals("Eatery", diningrooms.getName());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(10, room.getCapacity());
    }
}
