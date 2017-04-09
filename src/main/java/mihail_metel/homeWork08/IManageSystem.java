package mihail_metel.homeWork08;

import java.util.*;

public class IManageSystem<T extends Food> implements IManageSystemInt<T>{
    private Map<T, Double> dB = new HashMap<>();

    @Override
    public T save(T obj, double price){
        if (dB.containsKey(obj)) {
            dB.remove(obj);
        }
        dB.put(obj, price);
        return obj;
    }

    @Override
    public T save(T obj){
        if (dB.containsKey(obj)) {
            dB.remove(obj);
        }
        dB.put(obj, (double) 0);
        return obj;
    }

    @Override
    public void delete(T obj){
        dB.remove(obj);
    }

    public void deleteById(int id){

        for(T food: dB.keySet()){
            if(food.getId() == id) {
                dB.remove(food);
            }
        }
    }

    @Override
    public T get(int id) {
        Iterator<T> it = dB.keySet().iterator();
        while (it.hasNext()) {
            T t = it.next();
            if (t.getId() == id) {
                return t;
            }
        }
        return null;
    }

    @Override
    public double getPrice(T obj){
        return dB.get(obj);
    }

    @Override
    public Set<T> getProducts(){
        return dB.keySet();
    }

    @Override
    public List<Double> getPrices(){
        return new ArrayList<>(dB.values());
    }
}

