package crazyjedi.homeWork7.user_methods;

import java.util.*;

/**
 * Created by Vlad on 13.03.2017.
 */
public class Main {

    public static void printMap(Map mp) {
        Iterator it = mp.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
            it.remove(); // avoids a ConcurrentModificationException
        }
    }

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

        System.out.println("Orders\n");

        for (Order order : orders) {
            System.out.println(order);
        }

        orders.sort(new OrderComparatorByNameAscIdAscCityAsc());

        System.out.println("\nOrders by Name, Id, City\n");

        for (Order order : orders) {
            System.out.println(order);
        }

        orders.sort(new OrderComparatorByPriceDesc());

        System.out.println("\nOrders by Price desc\n");

        for (Order order : orders) {
            System.out.println(order);
        }


        orders.sort(new OrderComparatorByPriceAcsCityAsc());

        System.out.println("\nOrders by Price acs, City asc\n");

        for (Order order : orders) {
            System.out.println(order);
        }

        Iterator<Order> iter = orders.iterator();
        List newList = new ArrayList<Order>();
        while(iter.hasNext()){
            Order currentOrder = iter.next();
            if(!newList.contains(currentOrder)){
                newList.add(currentOrder);
            }
            else{
                iter.remove();
            }
        }

        System.out.println("\nNo duplicates\n");

        for (Order order : orders) {
            System.out.println(order);
        }

        iter = orders.iterator();
        while(iter.hasNext()){
            Order currentOrder = iter.next();
            if(currentOrder.getPrice()<1500){
                iter.remove();
            }
        }

        System.out.println("\nPrice > 1500\n");

        for (Order order : orders) {
            System.out.println(order);
        }


        List<Order> uahOrders = new ArrayList<Order>();
        List<Order> usdOrders = new ArrayList<Order>();

        for (Order order : orders) {
            if(order.getCurrency()==USD_CURRENCY){
                usdOrders.add(order);
            }
            if(order.getCurrency()==UAH_CURRENCY){
                uahOrders.add(order);
            }
        }

        System.out.println("\nUAH Orders\n");

        for (Order uahOrder : uahOrders) {
            System.out.println(uahOrder);
        }

        System.out.println("\nUSD Orders\n");

        for (Order usdOrder : usdOrders) {
            System.out.println(usdOrder);
        }


        System.out.println("\nLists by sity\n");

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

        Map<String,List<Order>> citiesMap = new HashMap<String,List<Order>>();

        for (Order order : orders) {
            String curCity = order.getUser().getCity();
            if(curCity==null){
                continue;
            }
            if(citiesMap.containsKey(curCity)){
                citiesMap.get(curCity).add(order);
            }
            else{
                List<Order> cityList = new ArrayList<Order>();
                cityList.add(order);
                citiesMap.put(curCity, cityList);
            }

        }

        printMap(citiesMap);


        //ЗАДАНИЕ 3

        //Создаю 10 пользователей =)

        User user1 = new User(1,"User1", "User1", "City1", 1000);
        User user2 = new User(2,"User2", "User2", "City2", 2000);
        User user3 = new User(3,"User3", "User3", "City3", 5000);
        User user4 = new User(4,"User4", "Petrov", "City2", 1000);
        User user5 = new User(5,"User5", "User5", "City1", 8000);
        User user6 = new User(6,"User6", "User6", "City4", 1600);
        User user7 = new User(7,"User7", "User7", "City5", 3000);
        User user8 = new User(8,"User8", "User8", "City1", 2700);
        User user9 = new User(9,"User9", "User9", "City3", 8000);
        User user10 = new User(10,"User10", "User10", "City4", 15000);

        Order order1 = new Order(2,100, UAH_CURRENCY, "item1", "myShop1", user1);
        Order order2 = new Order(2,100, UAH_CURRENCY, "item1", "myShop1", user1);
        Order order3= new Order(3,150, USD_CURRENCY, "item3", "myShop3", user2);
        Order order4 = new Order(4,200, UAH_CURRENCY, "item6", "myShop5", user3);
        Order order5 = new Order(5,100, UAH_CURRENCY, "item7", "myShop17", user4);
        Order order6 = new Order(6,100, USD_CURRENCY, "item5", "myShop8", user5);
        Order order7 = new Order(7,140, UAH_CURRENCY, "item4", "myShop4", user6);
        Order order8 = new Order(8,130, UAH_CURRENCY, "item3", "myShop14", user7);
        Order order9 = new Order(9,150, USD_CURRENCY, "item1", "myShop2", user8);
        Order order10 = new Order(10,167, UAH_CURRENCY, "item5", "myShop61", user9);

        Set<Order> orders_set = new TreeSet<Order>();
        orders_set.add(order1);
        orders_set.add(order2);
        orders_set.add(order3);
        orders_set.add(order4);
        orders_set.add(order5);
        orders_set.add(order6);
        orders_set.add(order7);
        orders_set.add(order8);
        orders_set.add(order9);
        orders_set.add(order10);

        System.out.println(orders_set.contains(order4));

        //-выведите заказ с наибольшей ценой, исспользуя только один сет-метод - get
        //у сета НЕТ МЕТОДА get =)) Он не имеет смысла в контексте множества. Оно не имеет индекса.

        Iterator<Order> it = orders_set.iterator();
        Order current;
        int max_price=-1;
        Order maxPriceOrder=null;
        while(it.hasNext()){
            current = it.next();
            if(current.getPrice()>max_price){
                maxPriceOrder=current;
            }
        }
        if(maxPriceOrder!=null){
            System.out.println("Max Price Order : "+maxPriceOrder.toString());
        }

        it = orders_set.iterator();
        while(it.hasNext()){
            if(it.next().getCurrency()==USD_CURRENCY){
                it.remove();
            }
        }


        it = orders_set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }



}
