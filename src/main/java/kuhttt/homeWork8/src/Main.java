import java.util.*;

/**
 * Created by Asus on 15.05.2017.
 */
public class Main {

    public static void main(String[] args) {
        Food banana = new Food("banana", Country.AFRICA, 5);
        Food meat = new Food("meat", Country.UKRAINE, 3);
        Food peanuts = new Food("peanuts", Country.FRANCE, 14);
        Food vine = new Food("vine" ,Country.FRANCE, 18250);
        Food butter = new Food("butter", Country.POLAND, 10);

        ManageSystemImpl manageSystem = new ManageSystemImpl();

        manageSystem.save(banana, 100);
        manageSystem.save(meat);
        manageSystem.save(peanuts, 300);
        manageSystem.save(vine, 1000);
        manageSystem.save(butter, 50);

        manageSystem.delete(peanuts);
        manageSystem.deleteById(butter.getId());

        manageSystem.save(peanuts, 200);
        manageSystem.save(butter, 60);

        System.out.println(manageSystem.get(meat.getId()));
        System.out.println(manageSystem.get("wrong id"));

        System.out.println("========");

        System.out.println("Price for vine is: " + manageSystem.getPrice(vine));

        System.out.println("========");

        Set<Food> products = new HashSet<>(manageSystem.getProducts());
        List<Double> prices = new ArrayList<>(manageSystem.getPrices());

        for (Food product : products) {
            System.out.println(product);
        }

        for (Double price : prices) {
            System.out.println(price);
        }

        System.out.println("========");

        manageSystem.printProductsSortedByName();

        System.out.println("========");

        manageSystem.printProductsSortedByPrice();
    }

}
