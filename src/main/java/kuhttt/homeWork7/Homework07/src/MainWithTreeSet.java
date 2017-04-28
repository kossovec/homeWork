import java.util.*;

/**
 * Created by Asus on 18.04.2017.
 */
public class MainWithTreeSet {

    public static void main(String[] args) {

        User user1 = new User(1, "Petya", "Sidorov", "Kiev", 1000);
        User user2 = new User(2, "Roma", "Kulinich", "Odesa", 1000);
        User user3 = new User(3, "Katya", "Onohina", "Lviv", 1000);
        User user4 = new User(4, "Slava", "Romanov", "Kharkiv", 1000);
        User user5 = new User(5, "Vova", "Pershin", "Lviv", 1000);
        User user6 = new User(6, "Natasha", "Loboda", "Kiev", 1000);
        User user7 = new User(7, "Grisha", "Sobolev", "Mariupol", 1000);
        User user8 = new User(8, "Liza", "Ulukaeva", "Odesa", 1000);
        User user9 = new User(9, "Sveta", "Svetolina", "Vinnica", 1000);
        User user10 = new User(10, "Andrey", "Pasternak", "Kiev", 1000);

        Locale localeUS = Locale.US;
        Locale localeUKR = new Locale("uk", "UA");

        Currency usd = Currency.getInstance(localeUS);
        Currency uah = Currency.getInstance(localeUKR);

        TreeSet<Order> orders = new TreeSet<>(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
        orders.add(new Order(1, 686, uah, "iPhone 7", "Shop1", user1));
        orders.add(new Order(2, 3000, uah, "iPhone 4", "Shop2", user2));
        orders.add(new Order(3, 700, usd, "iPhone 6", "Shop3", user3));
        orders.add(new Order(4, 500, usd, "iPhone 5", "Shop1", user4));
        orders.add(new Order(5, 3050, uah, "iPad 7", "Shop5", user5));
        orders.add(new Order(6, 4500, uah, "iPhone 7", "Shop6", user6));
        orders.add(new Order(7, 30670, usd, "iPod", "Shop3", user7));
        orders.add(new Order(8, 34400, uah, "iPencil", "Shop7", user8));
        orders.add(new Order(9, 300, usd, "iPhone 3", "Shop8", user9));
        orders.add(new Order(9, 300, usd, "iPhone 3", "Shop8", user9));

        int i =0;
        for (Order order : orders) {
            if(order.getUser().getLastName().equals("Petrov")) {
                i++;
            }
        }
        System.out.println(i + " people with last name Petrov found.");

        System.out.println("Order with largest price is " + '\n' + orders.last());

        Iterator<Order> orderIter;
        orderIter = orders.iterator();

        while (orderIter.hasNext()) {
            Order o = orderIter.next();
            if (o.getCurrency() == usd) {orderIter.remove();}
        }

        System.out.println("Orders in UAH: ");

        for (Order order : orders) {
            System.out.println(order);
        }

    }

}
