package mihail_metel.homeWork07.homeWork05Collections;

import com.sun.istack.internal.Nullable;

public abstract class APIImpl implements API {
   @Nullable
   HotelsDAOImpl hotelsDAO;

   public APIImpl(Room[] rooms){
        this.hotelsDAO = new HotelsDAOImpl(rooms);
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
       if (hotelsDAO == null) {return new Room[0];}
       return hotelsDAO.findRooms(price, persons, city, hotel);
    }

    @Override
    public HotelsDAOImpl getHotelsDAO() {
        return hotelsDAO;
    }
}