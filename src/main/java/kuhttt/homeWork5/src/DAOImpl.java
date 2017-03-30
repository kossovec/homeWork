import java.util.ArrayList;

/**
 * Created by Asus on 17.03.2017.
 */
public class DAOImpl implements DAO {

    private ArrayList<Room> rooms = new ArrayList();

    @Override
    public Room save(Room room) {
        rooms.add(room);
        System.out.println("Room under id " + room.getId() + " saved.");
        return room;
    }

    @Override
    public boolean delete(Room room) {
        if(rooms.contains(room)) {
        rooms.remove(room);
            System.out.println("Room under id " + room.getId() + " deleted.");
        return true;
        }
        System.out.println("Room under id " + room.getId() + " not found.");
        return false;
    }

    @Override
    public Room update(Room room) {
        for (int i = 0; i < rooms.size(); i++) {
            if (rooms.get(i).getId() == room.getId()) {
                System.out.println("Room under id " + room.getId() + " updated.");
                rooms.set(i, room);
            }
        }
        return room;
    }

    @Override
    public Room findById(long id) {
        for (Room roomIter: rooms) {
            if(roomIter.getId() == id) {
                System.out.println("Room under id " + roomIter.getId() + " found.");
                return roomIter;
            }
        }
        return null;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }
}
