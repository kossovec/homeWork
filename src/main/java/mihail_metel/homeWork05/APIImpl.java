package mihail_metel.homeWork05;

import com.sun.istack.internal.Nullable;

public abstract class APIImpl implements API {
   @Nullable HotelsDAOImpl hotelsDAO;

   public APIImpl(Room[] rooms){
        this.hotelsDAO = new HotelsDAOImpl(rooms);
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
       if (hotelsDAO == null) {return null;}
       return hotelsDAO.findRooms(price, persons, city, hotel);
    }

    @Override
    public HotelsDAOImpl getHotelsDAO() {
        return hotelsDAO;
    }

    @Override
    public boolean setHotelsDAO(HotelsDAOImpl hotelsDAO) {
        if (hotelsDAO == null) return false;
        this.hotelsDAO = hotelsDAO;
        return true;
    }
}