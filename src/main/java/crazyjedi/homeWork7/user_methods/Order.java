package crazyjedi.homeWork7.user_methods;

import java.util.Comparator;
import java.util.Currency;

/**
 * Created by Vlad on 13.03.2017.
 */
public class Order implements Comparable<Order>{
    private long id;
    private int price;
    private Currency currency;
    private String itemName;
    private String shopIdentificator;
    private User user;
    private final int FX = 27;

    public Order(long id, int price, Currency currency, String itemName, String shopIdentificator, User user) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.itemName = itemName;
        this.shopIdentificator = shopIdentificator;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getShopIdentificator() {
        return shopIdentificator;
    }

    public void setShopIdentificator(String shopIdentificator) {
        this.shopIdentificator = shopIdentificator;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (getId() != order.getId()) return false;
        if (getPrice() != order.getPrice()) return false;
        if (getCurrency() != null ? !getCurrency().equals(order.getCurrency()) : order.getCurrency() != null)
            return false;
        if (getItemName() != null ? !getItemName().equals(order.getItemName()) : order.getItemName() != null)
            return false;
        if (getShopIdentificator() != null ? !getShopIdentificator().equals(order.getShopIdentificator()) : order.getShopIdentificator() != null)
            return false;
        return getUser() != null ? getUser().equals(order.getUser()) : order.getUser() == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (getId() ^ (getId() >>> 32));
        result = 31 * result + getPrice();
        result = 31 * result + (getCurrency() != null ? getCurrency().hashCode() : 0);
        result = 31 * result + (getItemName() != null ? getItemName().hashCode() : 0);
        result = 31 * result + (getShopIdentificator() != null ? getShopIdentificator().hashCode() : 0);
        result = 31 * result + (getUser() != null ? getUser().hashCode() : 0);
        return result;
    }


    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", price=" + price +
                ", currency=" + currency +
                ", itemName='" + itemName + '\'' +
                ", shopIdentificator='" + shopIdentificator + '\'' +
                ", user=" + user +
                '}';
    }


    @Override
    public int compareTo(Order o) {
        //Вот серьезно, понятия не имею как сравнить два заказа. Буду исходить из сравнения сумм.
        //также, предположу, что курс доллара к гривне фиксирован. Потому что иначе надо его получать из базы
        //причем непонятно на дату заказа (это если для аналитики) или на текущую дату (для обработки заказа).
        if(o.getCurrency()==null||this.getCurrency()==null){
            throw new IllegalArgumentException("No currency found");
        }
        if(this.equals(o)){
            return 0;
        }
        if(o.getCurrency()==this.getCurrency()){
            if(this.getPrice()==o.getPrice()){
                return 0;
            }
            if(this.getPrice()>o.getPrice()){
                return 1;
            }
            if(this.getPrice()<o.getPrice()){
                return -1;
            }
        }
        else {
            int price_hrn_this = this.getCurrency()==Currency.getInstance("UAH") ? this.getPrice() : FX*this.getPrice();
            int price_hrn_other = o.getCurrency()==Currency.getInstance("UAH") ? o.getPrice() : FX*o.getPrice();

            if(price_hrn_this==price_hrn_other){
                return 0;
            }
            if(price_hrn_this>price_hrn_other){
                return 1;
            }
            if(price_hrn_this<price_hrn_other){
                return -1;
            }

        }
        return 0;
    }
}
