package crazyjedi.homeWork8;

import java.util.List;
import java.util.Set;

/**
 * Created by Vlad on 28.03.2017.
 */
public interface IManageSystem<T extends Food> {
    T save(T obj, double price);
    T save(T obj);
    void delete(T obj) ;
    void deleteById(int id);
    T get(int id);
    Double getPrice(T obj);
    Set<T> getProducts();
    List<Double> getPrices();
    void printProductsSortedByName();
    void printProductsSortedByPrice();
}
