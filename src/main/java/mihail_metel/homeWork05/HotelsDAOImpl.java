package homeWork05;

import java.util.Arrays;


public class HotelsDAOImpl implements HotelsDAO {

    private Room[] rooms;

    public HotelsDAOImpl(Room[] roomsArray) {
        rooms = roomsArray;
    }

    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] foundRooms = new Room[0];

        for (Room room : rooms) {
            if (room.getPrice() == price &&
                    room.getPersons() == persons &&
                    room.getCityName().equals(city) &&
                    room.getHotelName().equals(hotel)) {
                foundRooms = Arrays.copyOf(foundRooms, foundRooms.length + 1);
                foundRooms[foundRooms.length - 1] = room;
            }
        }
        return foundRooms;
    }

    @Override
    public Room save(Room room) {
        rooms = Arrays.copyOf(rooms, rooms.length + 1);
        rooms[rooms.length - 1] =  room;
        return rooms[rooms.length - 1];
    }

    @Override
    public boolean delete(Room room) {
        Room[] tempRooms;

        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].equals(room)) {
                tempRooms = Arrays.copyOfRange(rooms, 0, i - 1);
                tempRooms = Arrays.copyOf(tempRooms,rooms.length - 1);
                for (int i1 = 0; i1 < tempRooms.length; i1++) {
                    tempRooms[i + i1] = rooms[i + i1 + 1];
                }
                rooms = tempRooms;
                return true;
            }
        }
        return false;
    }

    @Override
    public Room update(Room room) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].equals(room) ) {
                rooms[i] = room;
                return rooms[i];
            }
        }
        return null;
    }

    @Override
    public Room findById(long id) {
        for (Room room : rooms) {
            if (room.getId() == id) {
                return room;
            }
        }
        return null;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public int getRoomCount(){
        return rooms.length;
    }
}
