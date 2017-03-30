package crazyjedi.homeWork8;

/**
 * Created by Vlad on 28.03.2017.
 */
public class Demo {

    public static void main(String[] args) {

        IdGenerator idGenerator = new IdGenerator();

        Food product1 = new Food("Foo", Countries.Country.FRANCE,5,idGenerator);
        Food product2 = new Food("Spam", Countries.Country.CHINA,54,idGenerator);
        Food product3 = new Food("Egg", Countries.Country.UKRAINE,15,idGenerator);
        Food product4 = new Food("Potato", Countries.Country.RUSSIA,23,idGenerator);
        Food product5 = new Food("Bacon", Countries.Country.FRANCE,18,idGenerator);
        Food product6 = null;

        System.out.println("Смотрим как создались продукты");
        System.out.println(product1);
        System.out.println(product5);

        FoodDatabase db = new FoodDatabase();

        db.save(product1,800);
        db.save(product2,200);
        db.save(product3,500);
        db.save(product4,600);
        db.save(product5,300);

        System.out.println("\nПродукт с id==2");
        System.out.println(db.get(2));

        System.out.println("\nСписок всех продуктов в базе");
        System.out.println(db.getProducts());

        System.out.println("\nСписок всех продуктов в базе после удаления продукта №5");
        db.delete(product5);
        System.out.println(db.getProducts());

        System.out.println("\nЦена несуществующего продукта и продукта №4");
        System.out.println(db.getPrice(product5));
        System.out.println(db.getPrice(product4));

        System.out.println("\nЦены на продукты");
        System.out.println(db.getPrices());

        System.out.println("\nУдаляем по id == 3");
        db.deleteById(3);
        System.out.println(db.getProducts());

        System.out.println("\nПытаемся вставить в базу null");
        db.save(null);
        System.out.println(db.getProducts());

        System.out.println("\nСортировка по имени");
        db.printProductsSortedByName();

        System.out.println("\nСортировка по цене");
        db.printProductsSortedByPrice();
    }


}
