package homeWork05.test;

import homeWork05.*;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/*
test methods reminder:
Assert.fail();
Assert.assertNotNull(apiArray);
Assert.assertNull(apiArray);
Assert.assertEquals(a, b);
Assert.assertNotEquals(a, b);

*/

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

public class ControllerTest {
    private Controller controller;

    @Test
    public void start() throws Exception {
        API[] apiArray = new APIImpl[3];
        FilledRooms filledRooms = new FilledRooms();

        apiArray[0] = new APIImpl("BookingComAPI", filledRooms.getRooms1() );
        apiArray[1] = new APIImpl("GoogleAPI", filledRooms.getRooms2() ) ;
        apiArray[2] = new APIImpl("TripAdvisorAPI", filledRooms.getRooms3() );

        controller = new Controller(apiArray);

        Assert.assertNotNull("Not Null",controller.getAPIArray());
        Assert.assertEquals("Lenght of API array ", controller.getAPIArray().length, 3);
    }


//    Room[] requstRooms(int price, int persons, String city, String hotel)
//    which finds all the rooms with requested params. Method use all apis available to make search.
//    Found rooms create to DB

    /*  rooms1[2] = new Room(800,1, date,"Hotel 3", "Cherkasi");
        rooms1[3] = new Room(1000,2, date,"Hotel 4", "Odesa");

        rooms2[3] = new Room(11000,3, date,"Hotel Ukraine", "Kiev");
        rooms3[3] = new Room(1000,2, date,"Hotel four", "Odesa");
        */


    @Test
    public void requstRooms() throws Exception {
        API[] apiArray = new APIImpl[3];
        FilledRooms filledRooms = new FilledRooms();

        apiArray[0] = new APIImpl("BookingComAPI", filledRooms.getRooms1() );
        apiArray[1] = new APIImpl("GoogleAPI", filledRooms.getRooms2() ) ;
        apiArray[2] = new APIImpl("TripAdvisorAPI", filledRooms.getRooms3() );

        controller = new Controller(apiArray);

        Assert.assertNotNull("Not Null",controller.getAPIArray());
        Assert.assertEquals("Lenght of API array ", controller.getAPIArray().length, 3);

        Assert.assertNotNull("Not Null",controller.getAPIArray());
        Assert.assertEquals("Lenght of API array ", controller.getAPIArray().length, 3);

        //rooms3[4] = new Room(2000,5, date,"Hotel popular", "Charkiv"); - встречается 2 раза

        Room[] rooms1 = controller.requstRooms(800,1,"Cherkasi", "Hotel 3");
        Room[] rooms2 = controller.requstRooms(1000,2,"Odesa", "Hotel 4");
        Room[] rooms3 = controller.requstRooms(2000,5,"Charkiv", "Hotel popular");

        Assert.assertNotNull("not null ",rooms1);
        Assert.assertEquals("one value of search ",1, rooms1.length);

        Assert.assertNotNull("not null ",rooms2);
        Assert.assertEquals("one value of search ",1, rooms2.length);

        Assert.assertNotNull("not null ",rooms3);
        Assert.assertEquals("number of found rooms ",2, rooms3.length);
    }

    /*Room[] check(API api1, API api2)
Chech how many the same rooms two different apis return*/

    @Test
    public void check() throws Exception {
        API[] apiArray = new APIImpl[3];
        FilledRooms filledRooms = new FilledRooms();

        apiArray[0] = new APIImpl("BookingComAPI", filledRooms.getRooms1() );
        apiArray[1] = new APIImpl("GoogleAPI", filledRooms.getRooms2() ) ;
        apiArray[2] = new APIImpl("TripAdvisorAPI", filledRooms.getRooms3() );

        controller = new Controller(apiArray);

        //rooms3[4] = new Room(2000,5, date,"Hotel popular", "Charkiv"); - встречается 2 раза

        Room[] rooms1 = controller.check(controller.getAPIArray()[0],controller.getAPIArray()[1]); // 0
        Room[] rooms2 = controller.check(controller.getAPIArray()[1],controller.getAPIArray()[2]); // 1 expected
        Room[] rooms3 = controller.check(controller.getAPIArray()[0],controller.getAPIArray()[2]); // 0

        Assert.assertNull("null ",rooms1);
        Assert.assertEquals("number of repeating ",0, rooms1.length);

       // Assert.assertNotNull("not null ",rooms2);
        //Assert.assertEquals("number of repeating ",1, rooms2.length);

//        Assert.assertNull("null ",rooms3);
//        Assert.assertEquals("number of repeating ",0, rooms3.length);

    }

}