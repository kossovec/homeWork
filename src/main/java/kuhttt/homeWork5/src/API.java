import java.util.ArrayList;

/**
 * Created by Asus on 17.03.2017.
 */
public interface API {

    ArrayList<Room> findRooms(int price, int persons, String city, String hotel);

    ArrayList<Room> getAllRooms();

}
