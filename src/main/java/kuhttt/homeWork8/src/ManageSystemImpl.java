import java.util.*;

/**
 * Created by Asus on 15.05.2017.
 */
public class ManageSystemImpl implements IManageSystem<Food> {

    private Map<Food, Double> database = new HashMap<>();

    @Override
    public Food save(Food obj, double price) {
        Double old = database.putIfAbsent(obj, price);
        if (old != null) {
            database.replace(obj, old, price);
        }
        return obj;
    }

    @Override
    public Food save(Food obj) {
        database.put(obj, null);
        return obj;
    }

    @Override
    public void delete(Food obj) {
        database.remove(obj);

    }

    @Override
    public void deleteById(String id) {
        for (Food obj : database.keySet()) {
            if (obj.getId().equals(id)) {
                database.remove(obj);
                break;
            }
        }

    }

    @Override
    public Food get(String id) {
        for (Food obj : database.keySet()) {
            if (obj.getId().equals(id)) {
                return obj;
            }
        }
        return null;
    }

    @Override
    public Double getPrice(Food obj) {
        return database.get(obj);
    }

    @Override
    public Set<Food> getProducts() {
        return database.keySet();
    }

    @Override
    public List<Double> getPrices() {
        List<Double> result = new ArrayList<>(database.values());
        return result;
    }

    @Override
    public void printProductsSortedByName() {
        Map<Food, Double> treeMap = new TreeMap<>(new Comparator<Food>() {
            @Override
            public int compare(Food o1, Food o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        treeMap.putAll(database);

        for (Map.Entry<Food, Double> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }

    @Override
    public void printProductsSortedByPrice() {
        List<Map.Entry<Food, Double>> list = new LinkedList<>(database.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Food, Double>>() {
            public int compare(Map.Entry<Food, Double> o1,
                               Map.Entry<Food, Double> o2) {
                if(o1.getValue() == null) {return -1;}
                else if (o2.getValue() == null) {return 1;}
                else {return (o1.getValue()).compareTo(o2.getValue());}
            }
        });

        Map<Food, Double> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Food, Double> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        for (Map.Entry<Food, Double> entry : sortedMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

    }
}
