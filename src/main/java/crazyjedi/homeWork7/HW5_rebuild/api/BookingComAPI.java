package crazyjedi.homeWork7.HW5_rebuild.api;

import crazyjedi.homeWork7.HW5_rebuild.Room;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Vlad on 27.02.2017.
 */
public class BookingComAPI implements API {

    public List<Room> rooms = new ArrayList<>();

    public BookingComAPI() {
        rooms.add(new Room(1, 100, 2, new Date(2017, 3, 4), "Hilton"
                        , "New Vasyuki"));
        rooms.add(new Room(1, 200, 3, new Date(2017, 4, 5), "Jack's"
                , "Los Santos"));
        rooms.add(new Room(1, 10, 50, new Date(2017, 4, 4), "Karavan-Saray"
                , "Agraba"));
        rooms.add(new Room(1, 20, 1, new Date(2017, 8, 2), "The Pirate Bay"
                , "Mogadishu"));
        rooms.add(new Room(1, 1000, 1, new Date(2017, 7, 4), "The Mended Drum"
                , "Ankh-Morpork"));

    }

    @Override
    public List<Room> findRooms(int price, int persons, String city, String hotel) {
        List<Room> result=new ArrayList<>();
        for (Room room : rooms) {
            if (room.getPrice() == price && room.getPersons() == persons && city.equals(room.getCityName())
                    && hotel.equals(room.getHotelName())) {
                result.add(room);
            }
        }
        return result;
    }

    @Override
    public List<Room> getAllRooms() {
        return rooms;
    }


}
