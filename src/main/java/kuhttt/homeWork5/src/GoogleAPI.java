import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Asus on 17.03.2017.
 */
public class GoogleAPI implements API {

    private static ArrayList<Room> rooms = new ArrayList<>();

    public GoogleAPI(){
        Date date = new Date();
        rooms.add(new Room(1, 1000, 4, date, "Hotel 1", "City 1"));
        rooms.add(new Room(2, 3500, 2, date, "Hotel 2", "City 4"));
        rooms.add(new Room(3, 500, 3, date, "Hotel 3", "City 2"));
        rooms.add(new Room(4, 500, 1, date, "Hotel 3", "City 2"));
        rooms.add(new Room(5, 11000, 4, date, "Hotel 4", "City 3"));
    }

    @Override
    public ArrayList<Room> findRooms(int price, int persons, String city, String hotel) {
        ArrayList<Room> results = new ArrayList<>();
        for (Room roomIter : rooms) {
            if(roomIter.getPrice() == price && roomIter.getPersons() == persons &&
                    roomIter.getCityName() == city && roomIter.getHotelName() == hotel) {
                results.add(roomIter);
            }
        }
        return results;
    }

    public ArrayList<Room> getAllRooms(){
        return rooms;
    }

}
