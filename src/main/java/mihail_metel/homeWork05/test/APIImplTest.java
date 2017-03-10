package homeWork05.test;

import homeWork05.APIImpl;
import homeWork05.FilledRooms;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class APIImplTest {
    FilledRooms filledRooms = new FilledRooms();
    APIImpl apiImpl = new APIImpl("BookingComAPI", filledRooms.getRooms1() );

    @Test
    public void findRooms() throws Exception {
        //         rooms1[4] = new Room(2000,5, date,"Hotel 5", "Charkiv");
        Assert.assertEquals("found 1 room",1,apiImpl.findRooms(2000, 5, "Charkiv", "Hotel 5").length );
        Assert.assertEquals("found 0 room",0,apiImpl.findRooms(2000, 5, "Charkiv", "Hotel ").length );
        Assert.assertEquals("found 0 room",0,apiImpl.findRooms(2010, 5, "Charkiv", "Hotel 5").length );
        Assert.assertEquals("found 0 room",0,apiImpl.findRooms(2000, 3, "Charkiv", "Hotel 5").length );
        Assert.assertEquals("found 0 room",0,apiImpl.findRooms(2000, 5, "Charkivvvv", "Hotel 5").length );
    }

    @Test
    public void getHotelsDAO() throws Exception {

    }

    @Test
    public void setHotelsDAO() throws Exception {
        Assert.assertEquals(apiImpl.setHotelsDAO(null),false);
    }

    @Test
    public void getApiName() throws Exception {

    }

    @Test
    public void setApiName() throws Exception {
        Assert.assertEquals(apiImpl.setApiName(null),false);
        Assert.assertEquals(apiImpl.setApiName(""),false);
        Assert.assertEquals(apiImpl.setApiName("some name"),true);
        Assert.assertEquals(apiImpl.getApiName(),"some name");
    }
}