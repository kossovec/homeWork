package main.java.mihail_metel.homeWork05;

/*
Create three implementations of API called: bookingComAPI, TripAdvisorAPI, GoogleAPI. Every implementation
has global variable Room[] rooms which must be initialized in empty constructor with 5 differentRooms.
 */
public class APIImpl implements API {
    private HotelsDAOImpl hotelsDAO;
    private String apiName;

   public APIImpl(String name, Room[] rooms){
        this.setApiName(name);
        this.hotelsDAO = new HotelsDAOImpl(rooms);
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return hotelsDAO.findRooms(price, persons, city, hotel);
    }

    @Override
    public HotelsDAOImpl getHotelsDAO() {
        return hotelsDAO;
    }

    @Override
    public boolean setHotelsDAO(HotelsDAOImpl hotelsDAO) {
        if (hotelsDAO == null) return false;
        this.hotelsDAO = hotelsDAO;
        return true;
    }

    @Override
    public String getApiName() {
        return apiName;
    }

    @Override
    public boolean setApiName(String apiName) {
       if (apiName == null || apiName.equals("")){
           return false;
       }

        this.apiName = apiName;
        return true;
    }
}