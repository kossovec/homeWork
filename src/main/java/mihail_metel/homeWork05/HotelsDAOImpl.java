package mihail_metel.homeWork05;


import org.testng.internal.Nullable;

import java.util.Arrays;


public class HotelsDAOImpl implements HotelsDAO {

    @Nullable private Room[] rooms;

    public HotelsDAOImpl(Room[] roomsArray) {
        rooms = roomsArray;
    }

    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int foundRoomsCount = 0;
        final int coefficientOfExtension = 2;
        Room[] foundRooms = new Room[foundRoomsCount];

        for (Room room : rooms) {
            if (room.getPrice() == price &&
                    room.getPersons() == persons &&
                    room.getCityName().equals(city) &&
                    room.getHotelName().equals(hotel)) {
                foundRoomsCount++;
                if (foundRooms.length < foundRoomsCount) {
                    foundRooms = Arrays.copyOf(foundRooms, foundRoomsCount * coefficientOfExtension);
                }
                foundRooms[foundRoomsCount - 1] = room;
            }
        }
        return Arrays.copyOfRange(foundRooms,0, foundRoomsCount);
    }

    @Override
    public Room saveNew(Room room) {
        if (this.findRooms(room.getPrice(), room.getPersons(), room.getCityName(),room.getHotelName() ).length == 0){
            rooms = Arrays.copyOf(rooms, rooms.length + 1);
            rooms[rooms.length - 1] =  room;
            return rooms[rooms.length - 1];
        }
        else {
            update(room);
            return room;
        }
    }

    @Override
    public Room saveAny(Room room) {
        rooms = Arrays.copyOf(rooms, rooms.length + 1);
        rooms[rooms.length - 1] =  room;
        return rooms[rooms.length - 1];
    }

    @Override
    public boolean delete(Room room) {
        Room[] tempRooms;

        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].equals(room)) {
                tempRooms = Arrays.copyOfRange(rooms, 0, i);
                tempRooms = Arrays.copyOf(tempRooms,rooms.length - 1);
                for (int j = i; j < tempRooms.length; j++) {
                    tempRooms[j] = rooms[j + 1];
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
