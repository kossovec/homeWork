package crazyjedi.homeWork7.user_methods;
import java.util.Comparator;

/**
 * Created by Vlad on 19.03.2017.
 */
public class OrderComparatorByNameAscIdAscCityAsc implements Comparator<Order>{
    @Override
    public int compare(Order o1, Order o2) {
        if(o1.getItemName().toLowerCase().compareTo(o2.getItemName().toLowerCase())!=0){
            return o1.getItemName().toLowerCase().compareTo(o2.getItemName().toLowerCase());
        }
        if(Long.compare(o1.getId(),o2.getId())!=0){
            return Long.compare(o1.getId(),o2.getId());
        }
        return o1.getUser().getCity().toLowerCase().compareTo(o2.getUser().getCity().toLowerCase());
    }
}
