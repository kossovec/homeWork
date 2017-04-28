import java.util.Currency;

/**
 * Created by Asus on 18.04.2017.
 */
public class Order {

    private long id;
    private int price;
    private Currency currency;
    private String itemName;
    private String shopIdentificator;
    private User user;

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
    public String toString() {
        return "Price: " + this.getPrice() + '\n' +
                "Item name: " + this.getItemName() + '\n' +
                "Shop ID: " + this.getShopIdentificator() + '\n' +
                "User surname: " + this.getUser().getLastName() + '\n' +
                "User city name: " + this.getUser().getCity() + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (getId() != order.getId()) return false;
        if (getPrice() != order.getPrice()) return false;
        if (!getCurrency().equals(order.getCurrency())) return false;
        if (!getItemName().equals(order.getItemName())) return false;
        if (!getShopIdentificator().equals(order.getShopIdentificator())) return false;
        return getUser().equals(order.getUser());
    }

    @Override
    public int hashCode() {
        int result = (int) (getId() ^ (getId() >>> 32));
        result = 31 * result + getPrice();
        result = 31 * result + getCurrency().hashCode();
        result = 31 * result + getItemName().hashCode();
        result = 31 * result + getShopIdentificator().hashCode();
        result = 31 * result + getUser().hashCode();
        return result;
    }
}
