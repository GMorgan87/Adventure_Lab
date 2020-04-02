import org.junit.Before;
import org.junit.Test;import quests.Room;

public class RoomTest {

    Room room;

    @Before
    public void before(){
        room = new Room();
    }

    @Test
    public void hasExits(){
        System.out.println(room.getExits());
    }
}
