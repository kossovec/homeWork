package mihail_metel.homeWork08;

import java.util.List;
import java.util.Set;

public interface IManageSystemInt<T extends Food> {
    T save(T obj, double price);
    T save(T obj);
    void delete(T obj);
    void deleteById(int id);
    T get(int id);
    double getPrice(T obj);
    Set<T> getProducts();
    List<Double> getPrices();
}
