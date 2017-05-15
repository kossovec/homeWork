/**
 * Created by Asus on 14.05.2017.
 */
public class IdGenerator {

    public static String getUniqueId(String name, Country country, int expiration) {
        return name + country.name() + expiration;
    }

}
