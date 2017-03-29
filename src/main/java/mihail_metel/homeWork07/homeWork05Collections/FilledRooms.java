package mihail_metel.homeWork07.homeWork05Collections;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class FilledRooms {
    private Room[] rooms1 = new Room[5];
    private Room[] rooms2 = new Room[5];
    private Room[] rooms3 = new Room[5];

    public FilledRooms(){
        FillRooms1();
        FillRooms2();
        FillRooms3();
    }

    void FillRooms1(){
        Date date = new Date();
        GregorianCalendar calendar = new GregorianCalendar();

        calendar.set(2017, Calendar.OCTOBER,10);
        date.setTime(calendar.getTimeInMillis());
        rooms1[0] = new Room( 1200,2, date,"Hotel 1", "Kiev");

        calendar.set(2017, Calendar.JULY,15);
        date.setTime(calendar.getTimeInMillis());
        rooms1[1] = new Room(1500,4, date,"Hotel 2", "Lviv");

        calendar.set(2018, Calendar.MARCH,11);
        date.setTime(calendar.getTimeInMillis());
        rooms1[2] = new Room(800,1, date,"Hotel 3", "Cherkasi");

        calendar.set(2017, Calendar.SEPTEMBER,5);
        date.setTime(calendar.getTimeInMillis());
        rooms1[3] = new Room(1000,2, date,"Hotel 4", "Odesa");

        calendar.set(2017, Calendar.OCTOBER,3);
        date.setTime(calendar.getTimeInMillis());
        rooms1[4] = new Room(2000,5, date,"Hotel 5", "Charkiv");
    }

    void FillRooms2(){
        Date date = new Date();
        GregorianCalendar calendar = new GregorianCalendar();

        calendar.set(2017, Calendar.OCTOBER,10);
        date.setTime(calendar.getTimeInMillis());
        rooms2[0] = new Room(700,1, date,"Hotel Hayat", "Kiev");

        calendar.set(2017, Calendar.JULY,15);
        date.setTime(calendar.getTimeInMillis());
        rooms2[1] = new Room(2000,5, date,"Hotel popular", "Charkiv");

        calendar.set(2018, Calendar.MARCH,11);
        date.setTime(calendar.getTimeInMillis());
        rooms2[2] = new Room(1500,2, date,"Hotel California", "New York");

        calendar.set(2017, Calendar.SEPTEMBER,5);
        date.setTime(calendar.getTimeInMillis());
        rooms2[3] = new Room(11000,3, date,"Hotel Ukraine", "Kiev");

        calendar.set(2017, Calendar.OCTOBER,3);
        date.setTime(calendar.getTimeInMillis());
        rooms2[4] = new Room(100,20, date,"Hotel Happy Gastarbaiter", "Charkiv");
    }

    void FillRooms3(){
        Date date = new Date();
        GregorianCalendar calendar = new GregorianCalendar();

        calendar.set(2017, Calendar.OCTOBER,10);
        date.setTime(calendar.getTimeInMillis());
        rooms3[0] = new Room(1200,2, date,"Hotel one", "Kiev");

        calendar.set(2017, Calendar.JULY,15);
        date.setTime(calendar.getTimeInMillis());
        rooms3[1] = new Room(1500,4, date,"Hotel two", "Lviv");

        calendar.set(2018, Calendar.MARCH,11);
        date.setTime(calendar.getTimeInMillis());
        rooms3[2] = new Room(850,1, date,"Hotel three", "Cherkasi");

        calendar.set(2017, Calendar.SEPTEMBER,5);
        date.setTime(calendar.getTimeInMillis());
        rooms3[3] = new Room(2000,2, date,"Hotel four", "Odesa");

        calendar.set(2017, Calendar.JULY,15);
        date.setTime(calendar.getTimeInMillis());
        rooms3[4] = new Room(2000,5, date,"Hotel popular", "Charkiv");
    }

    public Room[] getRooms1() {
        return rooms1;
    }

    public Room[] getRooms2() {
        return rooms2;
    }

    public Room[] getRooms3() {
        return rooms3;
    }
}
