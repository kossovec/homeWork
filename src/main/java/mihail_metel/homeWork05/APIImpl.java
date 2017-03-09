package homeWork05;

/*
Create three implementations of API called: bookingComAPI, TripAdvisorAPI, GoogleAPI. Every implementation
has global variable Room[] rooms which must be initialized in empty constructor with 5 differentRooms.
 */
public class APIImpl implements API {
    private HotelsDAOImpl hotelsDAO;
    private String apiName;

   public APIImpl(String name, Room[] rooms){
        this.apiName = name;
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
    public void setHotelsDAO(HotelsDAOImpl hotelsDAO) {
        this.hotelsDAO = hotelsDAO;
    }

    @Override
    public String getApiName() {
        return apiName;
    }

    @Override
    public void setApiName(String apiName) {
        this.apiName = apiName;
    }
}