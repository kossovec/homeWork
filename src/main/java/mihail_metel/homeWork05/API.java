package mihail_metel.homeWork05;


public interface API {
    Room[] findRooms(int price, int persons, String city, String hotel);
    HotelsDAOImpl getHotelsDAO();
}
