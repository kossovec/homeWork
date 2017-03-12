package homeWork06.Users;

/*TASK 5
Create сlass UserUtils with following methods
User[] uniqueUsers(User[] users)
//users are equal when all their field are equal
User[] usersWithContitionalBalance(User[] users, int balance)
//user’s balance == balance
User[] paySalaryToUsers(User[] users)
long[] getUsersId(User[] users)
User[] deleteEmptyUsers(User[] users)*/

import java.util.Arrays;

public class UserUtils {

    //users are equal when all their field are equal
    static User[] uniqueUsers(User[] users){
        if (users == null || users.length == 0){return null;}
        User[] uniqueUsers = new User[users.length];
        int uniqueUsersCount = 0;
        int rep;
        for (int i = 0; i < users.length; i++) {
            rep = 0;
            for (int i1 = 0; i1 < users.length; i1++) {
                if ( (i != i1) && users[i].equals(users[i1])) {
                    rep++;
                }
            }
            if (rep == 0) {
                uniqueUsersCount++;
                uniqueUsers[uniqueUsersCount - 1] = users[i];
            }
        }
        return Arrays.copyOf(uniqueUsers, uniqueUsersCount);
    }

    //user’s balance == balance
    static User[] usersWithContitionalBalance(User[] users, int balance){
        if (users == null || users.length == 0){return null;}

        User[] balanceUsers = new User[users.length];
        int balanceUsersCount = 0;
        int rep;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getBalance() == balance) {
                balanceUsersCount++;
                balanceUsers[balanceUsersCount - 1] = users[i];
            }
        }
        return Arrays.copyOf(balanceUsers, balanceUsersCount);
    }

    static final User[] paySalaryToUsers(User[] users){
        if (users == null || users.length == 0){return null;}

        for (int i = 0; i < users.length; i++) {
            users[i].setBalance(users[i].getBalance() + users[i].getSalary());
        }
        return users;
    }

    static final long[] getUsersId(User[] users) {
        if (users == null || users.length == 0){return null;}

        long[] usersID = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            usersID[i] = users[i].getId();
        }
        return usersID;
    }

    // consider empty if salary and balance are 0
    static User[] deleteEmptyUsers(User[] users) {
        if (users == null || users.length == 0){return null;}

        User[] notEmptyUsers = new User[users.length];
        int notEmptyUsersCount = 0;
        for (int i = 0; i < users.length; i++) {
            if ((users[i].getSalary() != 0) || (users[i].getBalance() != 0)) {
                notEmptyUsersCount++;
                notEmptyUsers[notEmptyUsersCount - 1] = users[i];
            }
        }
        return Arrays.copyOf(notEmptyUsers, notEmptyUsersCount);
    }
}
