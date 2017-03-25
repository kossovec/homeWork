package crazyjedi.homeWork7.user_methods;

import java.util.Comparator;

/**
 * Created by Vlad on 19.03.2017.
 */
public class OrderComparatorByPriceDesc implements Comparator<Order>{

    @Override
    public int compare(Order o1, Order o2) {
        return -Integer.compare(o1.getPrice(),o2.getPrice());
    }
}
