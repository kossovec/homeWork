package mihail_metel.homeWork05;


public class Controller {
    private API apis[] = new API[3];

    public Controller(API[] apiArray) {
        this.apis = apiArray;
    }

    public Room[] requstRooms(int price, int persons, String city, String hotel){
        Room[] tempRooms;
        HotelsDAOImpl tempDAO = new HotelsDAOImpl(new Room[0]);

        for (int i = 0; i < apis.length; i++) {
            tempRooms = apis[i].findRooms(price, persons, city, hotel) ;
            for (int j = 0; j < tempRooms.length; j++) {
                tempDAO.saveAny(tempRooms[j]);
            }
        }
        return tempDAO.getRooms();
    }

    public Room[] check(API api1, API api2){
        Room[] tempRooms;
        HotelsDAOImpl tempDAO = new HotelsDAOImpl(new Room[0]);

        for (int i = 0; i < api1.getHotelsDAO().getRoomCount(); i++) {
            for (int j = 0; j < api2.getHotelsDAO().getRoomCount(); j++) {
                if (api1.getHotelsDAO().getRooms()[i].equals(api2.getHotelsDAO().getRooms()[j] ) ) {
                    tempDAO.saveAny(api1.getHotelsDAO().getRooms()[i]);
                }
            }
        }
        return tempDAO.getRooms();
    }

    public API[] getAPIArray() {
        return apis;
    }
}
