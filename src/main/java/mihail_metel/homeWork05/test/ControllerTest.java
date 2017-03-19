package main.java.mihail_metel.homeWork05.test;

import main.java.mihail_metel.homeWork05.*;
import org.junit.Assert;
import org.junit.Test;


public class ControllerTest {
    private Controller controller;
    API[] apiArray = new APIImpl[3];
    FilledRooms filledRooms = new FilledRooms();

    {
        apiArray[0] = new APIImpl("BookingComAPI", filledRooms.getRooms1() );
        apiArray[1] = new APIImpl("GoogleAPI", filledRooms.getRooms2() ) ;
        apiArray[2] = new APIImpl("TripAdvisorAPI", filledRooms.getRooms3() );

        controller = new Controller(apiArray);
    }

    @Test
    public void start() throws Exception {
        Assert.assertNotNull("Not Null",controller.getAPIArray());
        Assert.assertEquals("Lenght of API array ", controller.getAPIArray().length, 3);
    }

    @Test
    public void requstRooms() throws Exception {
        Assert.assertNotNull("Not Null",controller.getAPIArray());
        Assert.assertEquals("Lenght of API array ", controller.getAPIArray().length, 3);

        Assert.assertNotNull("Not Null",controller.getAPIArray());
        Assert.assertEquals("Lenght of API array ", controller.getAPIArray().length, 3);

        //rooms3[4] = new Room(2000,5, date,"Hotel popular", "Charkiv"); - встречается 2 раза

        Room[] rooms1 = controller.requstRooms(800,1,"Cherkasi", "Hotel 3");
        Room[] rooms2 = controller.requstRooms(1000,2,"Odesa", "Hotel 4");
        Room[] rooms3 = controller.requstRooms(2000,5,"Charkiv", "Hotel popular");

        Assert.assertEquals("one value of search ",1, rooms1.length);
        Assert.assertEquals("one value of search ",1, rooms2.length);
        Assert.assertEquals("number of found rooms ",2, rooms3.length);
    }

    /*Room[] check(API api1, API api2)
Chech how many the same rooms two different apis return*/

    @Test
    public void check() throws Exception {
        //rooms3[4] = new Room(2000,5, date,"Hotel popular", "Charkiv"); - встречается 2 раза

        Room[] rooms1 = controller.check(controller.getAPIArray()[0],controller.getAPIArray()[1]); // 1
        Room[] rooms2 = controller.check(controller.getAPIArray()[1],controller.getAPIArray()[2]); // 1 expected
        Room[] rooms3 = controller.check(controller.getAPIArray()[0],controller.getAPIArray()[2]); // 3

        Assert.assertEquals(1, rooms1.length);
        Assert.assertEquals(1, rooms2.length);
        Assert.assertEquals(3, rooms3.length);

    }

}