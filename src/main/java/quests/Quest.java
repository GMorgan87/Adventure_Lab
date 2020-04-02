package quests;

import enemies.Enemy;

import players.Fighter;



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
    
    public String fight(Fighter fighter, Enemy enemy){
        while (fighter.getHealthPoints() > 0 && enemy.getHealthPoints() > 0){
            fighter.attack(fighter.getWeapons(), enemy);
            enemy.attack(fighter);
        }
        if (fighter.getHealthPoints() > 0){
            return fighter.getName() + " is the winner";
        }
        return "Enemy won";
    }


}
