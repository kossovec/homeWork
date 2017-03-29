package mihail_metel.homeWork07.homeWork05Collections;


public class Main {
    public static void main(String[] args) {
        API[] apiArray = new API[3];
        FilledRooms filledRooms = new FilledRooms();

        apiArray[0] = new BookingComAPI(filledRooms.getRooms1() );
        apiArray[1] = new GoogleAPI(filledRooms.getRooms2() ) ;
        apiArray[2] = new TripAdvisorAPI(filledRooms.getRooms3() );

        Controller controller = new Controller(apiArray);

        System.out.println(controller.requestRooms(800,1,"Cherkasi", "Hotel 3").length);
        System.out.println(controller.requestRooms(1000,2,"Odesa", "Hotel 4").length);
        System.out.println(controller.requestRooms(2000,5,"Charkiv", "Hotel popular").length);

        System.out.println(controller.check(controller.getAPIArray()[0],controller.getAPIArray()[1]).length);
        System.out.println(controller.check(controller.getAPIArray()[1],controller.getAPIArray()[2]).length);
        System.out.println(controller.check(controller.getAPIArray()[0],controller.getAPIArray()[2]).length);
    }
}
