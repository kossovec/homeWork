/**
 * Created by Asus on 14.05.2017.
 */
public class Food {

    private String id;
    private String name;
    private Country country;
    private int expiration;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public int getExpiration() {
        return expiration;
    }

    public void setExpiration(int expiration) {
        this.expiration = expiration;
    }

    public Food(String name, Country country, int expiration) {
        this.name = name;
        this.country = country;
        this.expiration = expiration;
        this.id = IdGenerator.getUniqueId(name, country, expiration);


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Food food = (Food) o;

        return getId().equals(food.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                '}';
    }
}
