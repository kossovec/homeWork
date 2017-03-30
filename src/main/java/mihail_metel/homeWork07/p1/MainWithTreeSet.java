package mihail_metel.homeWork07.p1;

import java.util.*;

public class MainWithTreeSet {
    public static void main(String[] args) {
        User user1 = new User(1, "Pavel", "Ivanov", "Kyiv", 2500);
        User user2 = new User(2, "Ivan", "Petrov", "Lviv", 4500);
        User user3 = new User(3, "Nikoloay", "Slonov", "Charkiv", 1500);
        User user4 = new User(4, "Sergey", "Petrenko", "Kyiv", 2500);
        User user5 = new User(5, "Mihail", "Gorbachov", "Nikolaev", 2000);
        User user6 = new User(6, "Kiril", "Petrov", "Mariupol", 500);
        User user7 = new User(7, "Natasha", "Segeeva", "Obuhov", 100);
        User user8 = new User(8, "Olia", "Parasko", "Irpen", 10000);
        User user9 = new User(9, "Oleg", "Gerachenko", "Brovary", 750);
        User user10 = new User(10, "Viktoria", "Kushnir", "Bila Cerkva", 5500);

        TreeSet<Order> orders = new TreeSet<Order>(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return (Integer.compare(o1.getPrice(),o2.getPrice() ) );
                }
        });

        orders.add(new Order(1, 2000, Currency.UAH, "Vacuum Cleaner", "Rozetka", user1));
        orders.add(new Order(2, 3000, Currency.USD, "Nokia phone", "Rozetka", user2));
        orders.add(new Order(3, 1000, Currency.USD, "Gaming mouse", "Citrus", user3));
        orders.add(new Order(5, 100, Currency.UAH, "Flash disc", "Citrus", user5));
        orders.add(new Order(5, 100, Currency.UAH, "Flash disc", "Citrus", user5));
        orders.add(new Order(6, 3500, Currency.USD, "Smartphone Samsung", "MoYo", user6));
        orders.add(new Order(7, 15000, Currency.UAH, "IPhone6", "Istore", user7));
        orders.add(new Order(8, 4500, Currency.USD, "Tablet PC", "Rozetka", user8));
        orders.add(new Order(9, 25000, Currency.UAH, "Electro-bike", "MoYo", user9));
        orders.add(new Order(10, 300, Currency.USD, "Music disc", "Foxtrot", user10));

        //проверьте, содержит ли сет заказ, где фамилия пользователя - “Petrov”
        String surname = "Petrov";
        int i = 0;
        for (Order o : orders) {
            if (o.getUser().getLastName().equals(surname)) {
                i++;
            }
        }
        if (i > 0) {
            System.out.println("Surname " + surname + " has been indicated in TreeSet for " + i + " times");
        }
        else {
            System.out.println("Surname " + surname + " has NOT been indicated in TreeSet");
        }


        //-выведите заказ с наибольшей ценой, исспользуя только один сет-метод - get
        System.out.println("Order with largest price: \n" + orders.last());

        //удалите заказы, где валюта доллар, используя Iterator
        Iterator<Order> ordersIterator;
        ordersIterator = orders.iterator();

        while (ordersIterator.hasNext()) {
            Order o = ordersIterator.next();
            if (o.getCurrency() == Currency.USD) {ordersIterator.remove();}
        }

        for (Order o : orders) {
            System.out.println(o);
        }
    }
}
