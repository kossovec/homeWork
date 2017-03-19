package main.java.mihail_metel.homeWork05;


public class Main {
    public static void main(String[] args) {
        API[] apiArray = new APIImpl[3];
        FilledRooms filledRooms = new FilledRooms();

        apiArray[0] = new APIImpl("BookingComAPI", filledRooms.getRooms1() );
        apiArray[1] = new APIImpl("GoogleAPI", filledRooms.getRooms2() ) ;
        apiArray[2] = new APIImpl("TripAdvisorAPI", filledRooms.getRooms3() );

        Controller controller = new Controller(apiArray);

        System.out.println(controller.requstRooms(800,1,"Cherkasi", "Hotel 3").length);
        System.out.println(controller.requstRooms(1000,2,"Odesa", "Hotel 4").length);
        System.out.println(controller.requstRooms(2000,5,"Charkiv", "Hotel popular").length);

        System.out.println(controller.check(controller.getAPIArray()[0],controller.getAPIArray()[1]).length);
        System.out.println(controller.check(controller.getAPIArray()[1],controller.getAPIArray()[2]).length);
        System.out.println(controller.check(controller.getAPIArray()[0],controller.getAPIArray()[2]).length);
    }
}
