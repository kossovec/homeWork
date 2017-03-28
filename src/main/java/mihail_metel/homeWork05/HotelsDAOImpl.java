package mihail_metel.homeWork05;


import org.testng.internal.Nullable;

import java.util.Arrays;


public class HotelsDAOImpl implements HotelsDAO {

    @Nullable private Room[] rooms;

    public HotelsDAOImpl(Room[] roomsArray) {
        rooms = roomsArray;
    }

    public Room[] findRooms(int price, int persons, String city, String hotel) {
        if (rooms == null || rooms.length == 0 || city == null || hotel == null) {return new Room[0];}

        int foundRoomsCount = 0;
        final int coefficientOfExtension = 2;
        Room[] foundRooms = new Room[foundRoomsCount];

        for (Room room : rooms) {
            if (room.getPrice() == price &&
                    room.getPersons() == persons &&
                    city.equals(room.getCityName())  &&
                    hotel.equals(room.getHotelName()) ) {
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
    public boolean saveNew(Room room) {
        if (room == null ) {return false;}
        if (this.rooms == null) {rooms = new Room[0];}

        if (findRooms(room.getPrice(), room.getPersons(), room.getCityName(),room.getHotelName() ).length == 0){
            rooms = Arrays.copyOf(rooms, rooms.length + 1);
            rooms[rooms.length - 1] =  room;
            return true;
        }
        else {
            update(room);
            return true;
        }
    }

    @Override
    public boolean saveAny(Room room) {
        if (room == null ) {return false;}
        if (rooms == null) {rooms = new Room[0];}

        rooms = Arrays.copyOf(rooms, rooms.length + 1);
        rooms[rooms.length - 1] =  room;
        return true;
    }

    @Override
    public boolean delete(Room room) {
        if (room == null ) {return false;}
        if (rooms == null || rooms.length == 0) {return false;}

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
        for (int i = 0; i < (rooms != null ? rooms.length : 0); i++) {
            if (rooms[i].equals(room) ) {
                rooms[i] = room;
                return rooms[i];
            }
        }
        return null;
    }

    @Override
    public Room findById(long id) {

        for (Room room : rooms != null ? rooms : new Room[0]) {
            if (room.getId() == id) {
                return room;
            }
        }
        return null;
    }

    public Room[] getRooms() {
        if (rooms == null) {rooms = new Room[0];}
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public int getRoomCount(){
        return rooms != null ? rooms.length : 0;
    }
}
