import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomsTest {

    private Bedrooms bedrooms;

    @Before
    public void setup(){
        bedrooms = new Bedrooms(RoomType.DOUBLE, 1, 50, 2);
    }

    @Test
    public void canGetCapacity(){
        assertEquals( 2, RoomType.getCapacity());
    }

    @Test
    public void canGetType(){
        assertEquals(RoomType.DOUBLE, RoomType.getType());
    }

    @Test
    public void canGetRoomNumber(){
        assertEquals( 1, bedrooms.getRoomNumber());
    }

    @Test
    public void canGetPrice(){
        assertEquals(50, bedrooms.getPrice());
    }
}