import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomsTest {

    private ConferenceRooms conferencerooms;
    private Room room;

    @Before
    public void setup(){
        conferencerooms = new ConferenceRooms(15, "TalkTalk", 350);
    }

    @Test
    public void canGetName(){
        assertEquals("TalkTalk", conferencerooms.getName());
    }

    @Test
    public void canGetPrice(){
        assertEquals(350, conferencerooms.getPrice());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(15, room.getCapacity());
    }

}
