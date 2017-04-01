/**
 * Created by Asus on 30.03.2017.
 */
public class UserUtils {

    public static User[] uniqueUsers(User[] users){
        User[] result = new User[users.length];
        int k = 0;
        int j = 0;
        while(k < users.length) {
            for(int i = k+1; i < users.length; i++){
                if(users[k].equals(users[i])) {
                    ++k;
                    break;
                }
            }
            result[j] = users[k];
            ++j;
            ++k;
        }
        return result;
    }
    //users are equal when all their field are equal
    public static User[] usersWithContitionalBalance(User[] users, int balance){
        User[] result = new User[users.length];
        int i = 0;
        for (User user : users) {
            if(user.getBalance() == balance) {
                result[i] = user;
                i++;
            }
        }
        return result;
    }
    //user’s balance == balance
    public static User[] paySalaryToUsers(User[] users){
        for (User user : users) {
            user.setBalance(user.getBalance() + user.getSalary());
        }
        return users;
    }
    public static long[] getUsersId(User[] users){
        long[] result = new long[users.length];
        int i  = 0;
        for (User user : users) {
            result[i] = user.getId();
            ++i;
        }
        return result;
    }
    public static User[] deleteEmptyUsers(User[] users){
        User[] result = new User[users.length];
        int i = 0;
        for (User user : users) {
            if(user.getBalance() == 0){
                continue;
            }
            result[i] = user;
            ++i;
        }
        return result;
    }

}
