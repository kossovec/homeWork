package mihail_metel.homeWork08;

import java.util.Date;
import java.util.Set;

public class Main
{
    public static void main(String[] args)
    {
        IManageSystemInt<Food> IMS = new IManageSystem<>();

        IMS.save(new Food("milk", Country.UKRAINE, new Date(2017, 4,2),10),19.9);
        IMS.save(new Food("bread", Country.EGYPT, new Date(2017, 3,1),8),8);
        IMS.save(new Food("mincermeat", Country.POLAND, new Date(2017, 4,3),6),85);
        IMS.save(new Food("aggs", Country.UKRAINE, new Date(2017, 4,2),20),22);
        IMS.save(new Food("pork knukle", Country.GERMANY, new Date(2017, 4,3),30),150.5);

        // remove bread
        IMS.delete(IMS.get(1));

        //remove pork by id
        IMS.deleteById(4);

        //get milk and price
        System.out.println("findbyId milk: " + IMS.get(0) + " price: " + IMS.getPrice(IMS.get(0)));

        // print products Set
        Set<Food> foodSet = IMS.getProducts();
        System.out.println("products Set: " + foodSet);

        //print prices list
        System.out.println("prices list: " + IMS.getPrices());

        //print missing food
        System.out.println(IMS.get(1235));
    }
}
