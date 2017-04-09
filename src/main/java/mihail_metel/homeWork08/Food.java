package mihail_metel.homeWork08;

import java.util.Date;

public class Food
{
    private int id;
    private String name;
    private Country country;
    private Date date; //= new Date(2014,12,1);
    private int daysOfExpire;

    Food(String name, Country country, Date date, int daysExpire){
        id = IdGen.id();
        this.name = name;
        this.country = country;
        this.date = date;
        this.daysOfExpire = daysExpire;
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
        return id;
    }

    @Override
    public String toString()
    {
        return id + " " + name + " " + country + " " + date.getYear()+ "/"+date.getMonth()+ "/"+
                date.getDay() + " Expires in " + daysOfExpire;
    }

    public int getId() {
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getDaysOfExpire() {
        return daysOfExpire;
    }

    public void setDaysOfExpire(int daysOfExpire) {
        this.daysOfExpire = daysOfExpire;
    }
}
