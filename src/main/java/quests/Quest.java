package quests;

import java.util.ArrayList;

public class Quest {

    private ArrayList<Room> rooms;
    private Room currentRoom;

    public Quest(){
        rooms = new ArrayList<Room>();
        rooms.add(new Room());
        rooms.add(new Room());
        rooms.add(new Room());
        rooms.add(new Room());
        rooms.add(new Room());
        currentRoom = rooms.get(0);
    }

    public ArrayList<Room> getRooms(){
        return this.rooms;
    }

    public void chooseExit(Exit exit){
        if (currentRoom.getExits().contains(exit)) {
            rooms.remove(0);
            currentRoom = rooms.get(0);
        }
        return;
    }

    public Room getCurrentRoom(){
        return this.currentRoom;
    }


}
