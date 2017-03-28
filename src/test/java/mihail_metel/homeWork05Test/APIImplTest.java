package mihail_metel.homeWork05Test;

import mihail_metel.homeWork05.API;
import mihail_metel.homeWork05.BookingComAPI;
import mihail_metel.homeWork05.FilledRooms;
import org.junit.Assert;
import org.junit.Test;

public class APIImplTest {
    FilledRooms filledRooms = new FilledRooms();
    API booking = new BookingComAPI(filledRooms.getRooms1() );

    @Test
    public void findRooms() throws Exception {
        //         rooms1[4] = new Room(2000,5, date,"Hotel 5", "Charkiv");
        Assert.assertEquals("found 1 room",1, booking.findRooms(2000, 5, "Charkiv", "Hotel 5").length );
        Assert.assertEquals("found 0 room",0, booking.findRooms(2000, 5, "Charkiv", "Hotel ").length );
        Assert.assertEquals("found 0 room",0, booking.findRooms(2010, 5, "Charkiv", "Hotel 5").length );
        Assert.assertEquals("found 0 room",0, booking.findRooms(2000, 3, "Charkiv", "Hotel 5").length );
        Assert.assertEquals("found 0 room",0, booking.findRooms(2000, 5, "Charkivvvv", "Hotel 5").length );
    }
}