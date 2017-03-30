import java.util.ArrayList;

/**
 * Created by Asus on 17.03.2017.
 */
public class Controller {

    private static API apis[] = new API[3];

    public Controller(API api1, API api2, API api3) {
        apis[0] = api1;
        apis[1] = api2;
        apis[2] = api3;
    }

    ArrayList<Room> requestRooms(int price, int persons, String city, String hotel){
        ArrayList<Room> apiRes = new ArrayList<>();
        for (int i = 0; i < apis.length; i++) {
            apiRes.addAll(apis[i].findRooms(price, persons, city, hotel));
        }
        DAOImpl roomDAO = new DAOImpl();
        for (Room apiResIter : apiRes) {
            roomDAO.save(apiResIter);
        }
        return roomDAO.getRooms();
    }

    ArrayList<Room> check(API api1, API api2){
        DAOImpl roomDAO = new DAOImpl();
        ArrayList<Room> api1Rooms = api1.getAllRooms();
        ArrayList<Room> api2Rooms = api2.getAllRooms();
        for (Room api1Iter : api1Rooms) {
            for (Room api2Iter : api2Rooms) {
                if(api1Iter.equals(api2Iter)) {
                    roomDAO.save(api1Iter);
                }
            }

        }
        return roomDAO.getRooms();
    }

}
