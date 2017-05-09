package crazyjedi.homeWork9;

import crazyjedi.homeWork7.user_methods.Order;

import java.util.Comparator;

/**
 * Created by Vlad on 02.05.2017.
 */
public class OrderComparatorFactory {
    enum COMPARATORS{
        PRICE
        ,PRICE_AND_CITY
        ,NAME_ID_CITY
    }
    static Comparator<Order> getOrderComparator(COMPARATORS CompType){
        switch (CompType){
            case PRICE: return (Order o1, Order o2) -> Integer.compare(o1.getPrice(),o2.getPrice());
            case PRICE_AND_CITY: return (Order o1, Order o2) -> {
                    int priceRes=Integer.compare(o1.getPrice(),o2.getPrice());
                    return priceRes!=0?priceRes:o1.getUser().getCity().toLowerCase().compareTo(o2.getUser().getCity().toLowerCase());
                };
            case NAME_ID_CITY: return (Order o1, Order o2) -> {
                    int nameRes = o1.getItemName().toLowerCase().compareTo(o2.getItemName().toLowerCase());
                    int idRes=Long.compare(o1.getId(),o2.getId());
                    int cityRes=o1.getUser().getCity().toLowerCase().compareTo(o2.getUser().getCity().toLowerCase());
                    if(nameRes!=0){
                        return nameRes;
                    }
                    if(idRes!=0){
                        return idRes;
                    }
                    return cityRes;
                };

        }
        return null;
    }
}
