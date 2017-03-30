package crazyjedi.homeWork8;

import java.awt.image.ImageConsumer;
import java.util.*;

/**
 * Created by Vlad on 28.03.2017.
 */
public class FoodDatabase implements IManageSystem {

    private Map<Food, Double> database = new HashMap<>();

    private class ComparatorByName implements Comparator<Map.Entry<Food,Double >> {
        @Override
        public int compare(Map.Entry<Food, Double > o1, Map.Entry<Food, Double > o2) {
            return o1.getKey().getName().compareTo(o2.getKey().getName());
        }
    }

    private class ComparatorByPrice implements Comparator<Map.Entry<Food,Double >> {
        @Override
        public int compare(Map.Entry<Food, Double > o1, Map.Entry<Food, Double > o2) {
            return o1.getValue().compareTo(o2.getValue());
        }
    }

    @Override
    public Food save(Food obj, double price) {
        if(obj!=null) {
            database.put(obj, price);
            return obj;
        }
        return null;
    }

    @Override
    public Food save(Food obj) {
        if(obj!=null) {
            database.put(obj, null);
            return obj;
        }
        return null;
    }

    @Override
    public void delete(Food obj) {
        database.remove(obj);
    }

    @Override
    public void deleteById(int id) {
        for (Food currentItem : database.keySet()) {
            if (currentItem.getId() == id) {
                database.remove(currentItem);
                break;
            }
        }
    }

    @Override
    public Food get(int id) {
        for (Food currentItem : database.keySet()) {
            if (currentItem.getId() == id) {
                return currentItem;
            }
        }
        return null;
    }

    @Override
    public Double getPrice(Food obj) {
        return database.get(obj);
    }

    @Override
    public Set getProducts() {
        return database.keySet();
    }

    @Override
    public List<Double> getPrices() {
        return new ArrayList<Double>(database.values());
    }

    @Override
    public void printProductsSortedByName() {
        List<Map.Entry<Food,Double>> entryList = new ArrayList<>(database.entrySet());
        entryList.sort(new ComparatorByName());
        for (Map.Entry<Food, Double> foodDoubleEntry : entryList) {
            System.out.println(foodDoubleEntry);
        }
    }

    @Override
    public void printProductsSortedByPrice() {
        List<Map.Entry<Food,Double>> entryList = new ArrayList<>(database.entrySet());
        entryList.sort(new ComparatorByPrice());
        for (Map.Entry<Food, Double> foodDoubleEntry : entryList) {
            System.out.println(foodDoubleEntry);
        }
    }
}
