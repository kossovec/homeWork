package crazyjedi.homeWork7.HW5_rebuild;


import crazyjedi.homeWork7.HW5_rebuild.api.API;
import crazyjedi.homeWork7.HW5_rebuild.api.BookingComAPI;
import crazyjedi.homeWork7.HW5_rebuild.api.GoogleAPI;
import crazyjedi.homeWork7.HW5_rebuild.api.TripAdvisorAPI;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vlad on 28.02.2017.
 */
public class Controller {
    public List<API> apis = new ArrayList<>();

    public Controller() {
        apis.add(new BookingComAPI());
        apis.add(new GoogleAPI());
        apis.add(new TripAdvisorAPI());
    }



    public List<Room> requstRooms(int price, int persons, String city, String hotel) {
        List<Room> result = new ArrayList<>();
        for (API api : apis) {
            for (Room room : api.findRooms(price, persons, city, hotel)) {
                result.add(room);
            }
        }
        return result;
    }

    ;

    public List<Room> check(API api1, API api2) {
        List<Room> result = new ArrayList<>();
        for (Room room : api1.getAllRooms()) {
            for (Room room1 : api2.getAllRooms()) {
                if (room.equals(room1)) {
                    result.add(room);
                }
            }
        }
        return result;
    }

    ;
}
