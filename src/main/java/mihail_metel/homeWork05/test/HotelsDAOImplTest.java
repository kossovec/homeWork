package homeWork05.test;

import homeWork05.FilledRooms;
import homeWork05.HotelsDAOImpl;
import homeWork05.Room;
import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class HotelsDAOImplTest {
    HotelsDAOImpl hotelsDAOImpl = new HotelsDAOImpl(new FilledRooms().getRooms1());

    @Test
    public void findRooms() throws Exception {
        //         rooms1[4] = new Room(2000,5, date,"Hotel 5", "Charkiv");
        Assert.assertEquals("found 1 room",1,hotelsDAOImpl.findRooms(2000, 5, "Charkiv", "Hotel 5").length );
        Assert.assertEquals("found 0 room",0,hotelsDAOImpl.findRooms(2000, 5, "Charkiv", "Hotel ").length );
        Assert.assertEquals("found 0 room",0,hotelsDAOImpl.findRooms(2010, 5, "Charkiv", "Hotel 5").length );
        Assert.assertEquals("found 0 room",0,hotelsDAOImpl.findRooms(2000, 3, "Charkiv", "Hotel 5").length );
        Assert.assertEquals("found 0 room",0,hotelsDAOImpl.findRooms(2000, 5, "Charkivvvv", "Hotel 5").length );
    }

    @Test
    public void save() throws Exception {
        Room room1 = hotelsDAOImpl.findRooms(2000, 5, "Charkiv", "Hotel 5")[0];

        hotelsDAOImpl.saveNew(room1);
        Assert.assertEquals(5,hotelsDAOImpl.getRoomCount());

        room1= new Room(200,5,room1.getDateAvailableFrom(), "Hotel11", "City");
        hotelsDAOImpl.saveNew(room1);
        Assert.assertEquals(6,hotelsDAOImpl.getRoomCount());

        hotelsDAOImpl.saveNew(room1);
        Assert.assertEquals(6,hotelsDAOImpl.getRoomCount());

        hotelsDAOImpl.saveAny(room1);
        Assert.assertEquals(7,hotelsDAOImpl.getRoomCount());
    }

    @Test
    public void delete() throws Exception {
        //rooms1[0] = new Room( 1200,2, date,"Hotel 1", "Kiev");
        Room room1 = hotelsDAOImpl.findRooms(2000, 5, "Charkiv", "Hotel 5")[0];

        hotelsDAOImpl.delete(room1);
        Assert.assertEquals(4,hotelsDAOImpl.getRoomCount());

        room1 = hotelsDAOImpl.findRooms(1200, 2, "Kiev", "Hotel 1")[0];
        Assert.assertEquals(true, hotelsDAOImpl.delete(room1) );
        Assert.assertEquals(false, hotelsDAOImpl.delete(room1) );
        Assert.assertEquals(3,hotelsDAOImpl.getRoomCount());
    }

    @Test
    public void update() throws Exception {
        Date date = new Date();
        GregorianCalendar calendar = new GregorianCalendar();

        calendar.set(2017, Calendar.NOVEMBER,15);
        date.setTime(calendar.getTimeInMillis());

        Room room1 = hotelsDAOImpl.findRooms(2000, 5, "Charkiv", "Hotel 5")[0];
        room1.setDateAvailableFrom(date);

        hotelsDAOImpl.update(room1);
        Assert.assertEquals(hotelsDAOImpl.findRooms(2000, 5, "Charkiv", "Hotel 5")[0].getDateAvailableFrom(),date);
    }

    @Test
    public void findById() throws Exception {
        Room room1 = hotelsDAOImpl.findRooms(1200, 2, "Kiev", "Hotel 1")[0];
        long id = room1.getId();

        Assert.assertEquals(hotelsDAOImpl.findById(id) ,room1);
    }

    @Test
    public void getRooms() throws Exception {

    }

    @Test
    public void setRooms() throws Exception {

    }

    @Test
    public void getRoomCount() throws Exception {
        Assert.assertEquals(hotelsDAOImpl.getRoomCount(),5);

        hotelsDAOImpl.setRooms(new Room[0]);
        Assert.assertEquals(hotelsDAOImpl.getRoomCount(),0);
    }

}