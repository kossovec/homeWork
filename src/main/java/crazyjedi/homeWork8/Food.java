package crazyjedi.homeWork8;

import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 * Created by Vlad on 28.03.2017.
 */
public class Food {

    private int id;
    private String name;
    private Countries.Country country;
    private int expiration;

    public Food(String name, Countries.Country country, int expiration, IdGenerator idGenerator) {
        this.id = idGenerator.generateId();
        this.name = name;
        this.country = country;
        this.expiration = expiration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Countries.Country getCountry() {
        return country;
    }

    public void setCountry(Countries.Country country) {
        this.country = country;
    }

    public int getExpiration() {
        return expiration;
    }

    public void setExpiration(int expiration) {
        this.expiration = expiration;
    }

    public long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Food food = (Food) o;

        return id == food.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country=" + country +
                ", expiration=" + expiration +
                '}';
    }
}
