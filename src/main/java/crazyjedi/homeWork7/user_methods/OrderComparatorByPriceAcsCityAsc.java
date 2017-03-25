package crazyjedi.homeWork7.user_methods;

import java.util.Comparator;

/**
 * Created by Vlad on 19.03.2017.
 */
public class OrderComparatorByPriceAcsCityAsc implements Comparator<Order> {

    @Override
    public int compare(Order o1, Order o2) {
        if(Integer.compare(o1.getPrice(),o2.getPrice())!=0){
            return Integer.compare(o1.getPrice(),o2.getPrice());
        }
        return o1.getUser().getCity().toLowerCase().compareTo(o1.getUser().getCity().toLowerCase());
    }
}
