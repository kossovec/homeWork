package homeWork05;

/*
TASK 6
Create Controller class. It contains global variable
API apis[] = new API[3];
which contains all impelentations of API interface.
Also, controller contains two methods
Room[] requstRooms(int price, int persons, String city, String hotel)
which finds all the rooms with requested params. Method use all apis available to make search.
Found rooms create to DB
Room[] check(API api1, API api2)
Chech how many the same rooms two different apis return
 */

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
            for (int i1 = 0; i1 < tempRooms.length; i1++) {
                tempDAO.saveAny(tempRooms[i1]);
            }
        }
        return tempDAO.getRooms();
    }

    public Room[] check(API api1, API api2){
        Room[] tempRooms;
        HotelsDAOImpl tempDAO = new HotelsDAOImpl(new Room[0]);

        for (int i = 0; i < api1.getHotelsDAO().getRoomCount(); i++) {
            for (int i1 = 0; i1 < api2.getHotelsDAO().getRoomCount(); i1++) {
                if (api1.getHotelsDAO().getRooms()[i].equals(api2.getHotelsDAO().getRooms()[i1] ) ) {
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
