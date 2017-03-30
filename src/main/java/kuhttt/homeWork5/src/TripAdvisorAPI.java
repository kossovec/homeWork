import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Asus on 17.03.2017.
 */
public class TripAdvisorAPI implements API {

    private static ArrayList<Room> rooms = new ArrayList<>();

    public TripAdvisorAPI() {
        Date date = new Date();
        rooms.add(new Room(6, 1000, 2, date, "Hotel 5", "City 5"));
        rooms.add(new Room(7, 350, 6, date, "Hotel 2", "City 7"));
        rooms.add(new Room(3, 500, 3, date, "Hotel 3", "City 2"));
        rooms.add(new Room(8, 5000, 3, date, "Hotel 6", "City 4"));
        rooms.add(new Room(5, 1000, 2, date, "Hotel 5", "City 5"));
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
