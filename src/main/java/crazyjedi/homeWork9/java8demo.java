package crazyjedi.homeWork9;


import com.sun.org.apache.xpath.internal.operations.Or;
import crazyjedi.homeWork7.user_methods.Order;
import crazyjedi.homeWork7.user_methods.User;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by Vlad on 06.04.2017.
 */
public class java8demo {

    public static void main(String[] args) {

        Currency USD_CURRENCY = Currency.getInstance("USD");
        Currency UAH_CURRENCY = Currency.getInstance("UAH");
        Currency EUR_CURRENCY = Currency.getInstance("EUR");

        List<User> users = new ArrayList<User>();
        List<Order> orders = new ArrayList<Order>();

        users.add(new User(1,"User1", "User1", "City1", 1000));
        users.add(new User(2,"User2", "User2", "City2", 2000));
        users.add(new User(3,"User3", "User3", "City4", 5000));
        users.add(new User(4,"User4", "User4", "City5", 3000));
        users.add(new User(5,"User5", "User5", "City3", 1000));
        users.add(new User(6,"User6", "User6", "City2", 1500));
        users.add(new User(7,"User7", "User7", "City1", 4000));
        users.add(new User(8,"User8", "User8", "City3", 8000));
        users.add(new User(9,"User9", "User9", "City5", 10000));
        users.add(new User(10,"User10", "User10", "City7", 9000));

        System.out.println("USERS\n");

        for (User user : users) {
            System.out.println(user);
        }

        orders.add(new Order(2,100, UAH_CURRENCY, "item1", "myShop1", users.get(0)));
        orders.add(new Order(2,100, UAH_CURRENCY, "item1", "myShop1", users.get(0)));
        orders.add(new Order(3,200, USD_CURRENCY, "item2", "myShop2", users.get(1)));
        orders.add(new Order(2,300, UAH_CURRENCY, "item1", "myShop1", users.get(2)));
        orders.add(new Order(4,100, UAH_CURRENCY, "item4", "myShop2", users.get(3)));
        orders.add(new Order(5,400, UAH_CURRENCY, "item5", "myShop1", users.get(4)));
        orders.add(new Order(8,10000, USD_CURRENCY, "item2", "myShop2", users.get(1)));
        orders.add(new Order(15,200, UAH_CURRENCY, "item7", "myShop1", users.get(5)));
        orders.add(new Order(11,300, UAH_CURRENCY, "item6", "myShop2", users.get(6)));
        orders.add(new Order(2,1200, EUR_CURRENCY, "item1", "myShop1", users.get(7)));
        orders.add(new Order(17,1600, UAH_CURRENCY, "item2", "myShop2", users.get(8)));

        System.out.println("\nOrders\n");

        for (Order order : orders) {
            System.out.println(order);
        }

        Comparator<Order> byPrice = OrderComparatorFactory.getOrderComparator(OrderComparatorFactory.COMPARATORS.PRICE);
        orders.sort(byPrice);

        System.out.println("\nSorted by price\n");

        for (Order order : orders) {
            System.out.println(order);
        }

        Comparator<Order> byPriceAscAndCity = OrderComparatorFactory
                .getOrderComparator(OrderComparatorFactory.COMPARATORS.PRICE_AND_CITY);

        System.out.println("\nSorted by price and city\n");
        orders.sort(byPriceAscAndCity); for (Order order : orders) {
            System.out.println(order);
        }

        Comparator<Order> byNameIdAndCity = OrderComparatorFactory
                .getOrderComparator(OrderComparatorFactory.COMPARATORS.NAME_ID_CITY);

        System.out.println("\nSorted by name, id and city\n");
        orders.sort(byNameIdAndCity);
        for (Order order : orders) {
            System.out.println(order);
        }

        System.out.println("\nNoDuplicates\n");
        List<Order> uniqueOrders = orders.parallelStream().distinct().collect(Collectors.toList());
        for (Order order : uniqueOrders) {
            System.out.println(order);
        }

        Map<Currency,List<Order>> currencyMap = orders.stream().collect(Collectors.groupingBy(Order::getCurrency));

        System.out.println("\nUSD ORDERS\n");
        Iterator<Order> iter = currencyMap.get(USD_CURRENCY).iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        System.out.println("\nUAH ORDERS\n");
        iter = currencyMap.get(UAH_CURRENCY).iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        Function<Order, String>  cityGetter = order -> order.getUser().getCity().toLowerCase();

        Map<String, List<Order>> cityMap = orders.stream().collect(Collectors.groupingBy(cityGetter));

        for (String city:cityMap.keySet()) {
            System.out.println('\n'+city+'\n');
            for (Order order:cityMap.get(city)){
                System.out.println(order);
            }
        }

        System.out.println("\nCheck if orders countain an order with last name Petrov\n");
        System.out.println(orders.stream().anyMatch(x -> x.getUser().getLastName()=="Petrov"));
        System.out.println("\nCheck if orders countain an order with last name User4\n");
        System.out.println(orders.stream().anyMatch(x -> x.getUser().getLastName()=="User4"));

        orders.removeIf(x->x.getCurrency().equals(USD_CURRENCY));

        System.out.println("Removed USD orders");

        for (Order order : orders) {
            System.out.println(order);
        }

    }

}
