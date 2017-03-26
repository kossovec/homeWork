package mihail_metel.homeWork07.p1;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        User user1 = new User(1, "Pavel", "Ivanov", "Kyiv", 2500);
        User user2 = new User(2, "Ivan", "Petrov", "Lviv", 4500);
        User user3 = new User(3, "Nikoloay", "Slonov", "Charkiv", 1500);
        User user4 = new User(4, "Sergey", "Petrenko", "Kyiv", 2500);
        User user5 = new User(5, "Mihail", "Gorbachov", "Nikolaev", 2000);
        User user6 = new User(6, "Kiril", "Poliakov", "Mariupol", 500);
        User user7 = new User(7, "Natasha", "Segeeva", "Obuhov", 100);
        User user8 = new User(8, "Olia", "Parasko", "Irpen", 10000);
        User user9 = new User(9, "Oleg", "Gerachenko", "Brovary", 750);
        User user10 = new User(10, "Viktoria", "Kushnir", "Bila Cerkva", 5500);

        Order order1 = new Order(1,2000, Currency.UAH, "Vacuum Cleaner", "Rozetka", user1);
        Order order2 = new Order(2,3000, Currency.UAH, "Nokia phone", "Rozetka", user2);
        Order order3 = new Order(3,1000, Currency.UAH, "Gaming mouse", "Citrus", user3);
        Order order4 = new Order(4,200, Currency.UAH, "Data cable", "Repka", user4);
        Order order5 = new Order(5,100, Currency.UAH, "Flash disc", "Citrus", user5);
        Order order6 = new Order(6,3500, Currency.UAH, "Smartphone Samsung", "MoYo", user6);
        Order order7 = new Order(7,15000, Currency.UAH, "IPhone6", "Istore", user7);
        Order order8 = new Order(8,4500, Currency.UAH, "Tablet PC", "Rozetka", user8);
        Order order9 = new Order(9,25000, Currency.UAH, "Electro-bike", "MoYo", user9);
        Order order10 = new Order(10,300, Currency.UAH, "Music disc", "Foxtrot", user10);

        List orderList = new ArrayList<Order>();
        orderList.add(order1);
        orderList.add(order2);
        orderList.add(order3);
        orderList.add(order4);
        orderList.add(order5);
        orderList.add(order6);
        orderList.add(order7);
        orderList.add(order8);
        orderList.add(order9);
        orderList.add(order10);

        System.out.println(orderList);

        orderList.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o, Order t1) {
                return -((Integer) o.getPrice() ).compareTo((Integer) t1.getPrice());
            }
        });

        System.out.println(orderList);
    }
}
