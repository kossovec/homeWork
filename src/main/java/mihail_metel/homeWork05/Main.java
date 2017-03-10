package homeWork05;

import java.util.Arrays;

/*
TASK 7
In Main class method just create Controller and make three requests with different parameters to find rooms.
Also, all check methods three times with different apis to demonstrate how programs works.
 */
public class Main {
    public static void main(String[] args) {
        API[] apiArray = new APIImpl[3];
        FilledRooms filledRooms = new FilledRooms();

        apiArray[0] = new APIImpl("BookingComAPI", filledRooms.getRooms1() );
        apiArray[1] = new APIImpl("GoogleAPI", filledRooms.getRooms2() ) ;
        apiArray[2] = new APIImpl("TripAdvisorAPI", filledRooms.getRooms3() );

        Controller controller = new Controller(apiArray);
        System.out.println(controller.requstRooms(800, 1, "Cherkasi", "Hotel 3").length);

        Room[] rooms2 = controller.check(controller.getAPIArray()[1],controller.getAPIArray()[2]); // 1 expected
        System.out.println(rooms2.length);
//        int[] array  = {1,2,3,4,5,6,7,8,9,10};
//        System.out.println(Arrays.toString(Arrays.copyOfRange(array, 0, 3)));

        //controller.check();
    }
}
