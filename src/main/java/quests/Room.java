package quests;
import java.util.ArrayList;
import java.util.Collections;

public class Room {

    private ArrayList<Exit> exits;

    public Room(){
        int numberToRemove = (int) (Math.random() * 4);
        this.exits = new ArrayList<Exit>();
        for (Exit nesw : Exit.values()){
            exits.add(nesw);
        }
        Collections.shuffle(this.exits);
        int i = 0;
        while (i < numberToRemove){
            this.exits.remove(0);
            i += 1;
        }
    }

    public ArrayList<Exit> getExits() {
        return this.exits;
    }
}
