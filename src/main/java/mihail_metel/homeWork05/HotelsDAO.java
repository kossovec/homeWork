package homeWork05;

public interface HotelsDAO {
    Room save(Room room);
    boolean delete(Room room);
    Room update(Room room);
    Room findById(long id);

    Room[] findRooms(int price, int persons, String city, String hotel);
}
