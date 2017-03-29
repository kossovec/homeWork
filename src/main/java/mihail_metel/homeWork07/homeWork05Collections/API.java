package mihail_metel.homeWork07.homeWork05Collections;


public interface API {
    Room[] findRooms(int price, int persons, String city, String hotel);
    HotelsDAOImpl getHotelsDAO();
}
