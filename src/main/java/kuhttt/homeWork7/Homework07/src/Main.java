import java.util.*;

/**
 * Created by Asus on 18.04.2017.
 */
public class Main {

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

        Order order1 = new Order(1, 3000, uah, "iPhone 7", "Shop1", user1);
        Order order2 = new Order(2, 200, uah, "iPhone 4", "Shop2", user2);
        Order order3 = new Order(3, 30560, usd, "iPhone 6", "Shop3", user3);
        Order order4 = new Order(4, 3400, usd, "iPhone 5", "Shop1", user4);
        Order order5 = new Order(5, 2300, uah, "iPad 7", "Shop5", user5);
        Order order6 = new Order(6, 89000, uah, "iPhone 7", "Shop6", user6);
        Order order7 = new Order(7, 500, usd, "iPod", "Shop3", user7);
        Order order8 = new Order(8, 1000, uah, "iPencil", "Shop7", user8);
        Order order9 = new Order(9, 200, usd, "iPhone 3", "Shop8", user9);
        Order order10 = new Order(10, 57600, usd, "iPhone 666", "Shop4", user10);

        List<Order> orders = new ArrayList<>();
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        orders.add(order4);
        orders.add(order5);
        orders.add(order6);
        orders.add(order7);
        orders.add(order8);
        orders.add(order9);
        orders.add(order10);

        orders.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });

        System.out.println("Sorted by price: ");
        for (Order order : orders) {
            System.out.println(order);
        }

        orders.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                if(o1.getPrice() == o2.getPrice()) {
                    return o1.getUser().getCity().compareTo(o2.getUser().getCity());
                }
                return o1.getPrice() - o2.getPrice();
            }
        });

        System.out.println("Sorted by city name and price: ");
        for (Order order : orders) {
            System.out.println(order);
        }

        orders.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                if(o1.getShopIdentificator().equals(o2.getShopIdentificator()) &&
                        o1.getItemName().equals(o2.getItemName())) {
                    return o1.getUser().getCity().compareTo(o2.getUser().getCity());
                } else if(o1.getItemName().equals(o2.getItemName())) {
                    return o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
                }
                return o1.getItemName().compareTo(o2.getItemName());
            }
        });

        System.out.println("Sorted by Order itemName, ShopIdentificator and User city: ");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
