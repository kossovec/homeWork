package crazyjedi.homeWork7.HW5_rebuild.api;


import crazyjedi.homeWork7.HW5_rebuild.Room;

import java.util.List;

/**
 * Created by Vlad on 27.02.2017.
 */
public interface API {
    public List<Room> findRooms(int price, int persons, String city, String hotel);
    public List<Room> getAllRooms();
}
