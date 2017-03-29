package mihail_metel.homeWork07.homeWork05Collections;

import java.util.ArrayList;

public interface HotelsDAO {
    boolean save(Room room);
    boolean delete(Room room);
    Room update(Room room);
    Room findById(long id);

    ArrayList findRooms(int price, int persons, String city, String hotel);
}
