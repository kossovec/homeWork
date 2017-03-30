import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by Asus on 28.03.2017.
 */
public class Main {

    public static void main(String[] args) {
        API google = new GoogleAPI();
        API tripAdvisor = new TripAdvisorAPI();
        API bookingCom = new BookingComAPI();
        Controller controller = new Controller(google, bookingCom, tripAdvisor);
        Date date = new Date();
        Room room1 = new Room(5462367, 300, 6, date, "Plaza", "Kiev");
        Room room2 = new Room(56, 400, 3, date, "Absolute", "Vinnica");
        Room room3 = new Room(568, 200, 2, date, "Rubin", "Dnepr");
        Room room3_1 = new Room(568, 250, 3, date, "Rubin", "Dnepr");
        System.out.println("=== Room request ===");
        ArrayList res = controller.requestRooms(1000, 4, "City 1", "Hotel 1");
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }

        res = controller.requestRooms(500, 3, "City 2", "Hotel 3");
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }

        res = controller.requestRooms(1000, 5, "City 5", "Hotel 5");
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }

        System.out.println("=== Check APIs ===");
        ArrayList<Room> check1 = controller.check(google, tripAdvisor);
        ArrayList<Room> check2 = controller.check(tripAdvisor, bookingCom);
        ArrayList<Room> check3 = controller.check(google, bookingCom);

        for (int i = 0; i < check1.size(); i++) {
            System.out.println(check1.get(i));
        }
        for (int i = 0; i < check2.size(); i++) {
            System.out.println(check2.get(i));
        }
        for (int i = 0; i < check3.size(); i++) {
            System.out.println(check3.get(i));
        }

        System.out.println("=== Database operations ===");
        DAOImpl database = new DAOImpl();
        database.save(room1);
        database.save(room2);
        database.save(room3);
        database.delete(room2);
        database.findById(568);
        database.update(room3_1);
        for(int i = 0; i < database.getRooms().size(); i++ ) {
            System.out.println(database.getRooms().get(i));
        }

    }

}
