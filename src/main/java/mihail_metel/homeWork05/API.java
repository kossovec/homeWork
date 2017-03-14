package main.java.mihail_metel.homeWork05;


/*
TASK  3
Create API interface which contains one method
Room[] findRooms(int price, int persons, String city, String hotel)
 */
public interface API {
    Room[] findRooms(int price, int persons, String city, String hotel);

    public HotelsDAOImpl getHotelsDAO();

    public boolean setHotelsDAO(HotelsDAOImpl hotelsDAO);

    public String getApiName();

    public boolean setApiName(String apiName);
}
