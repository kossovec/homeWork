package mihail_metel.homeWork06.Users;

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

class UserUtils {

    //users are equal when all their field are equal
    static User[] uniqueUsers(User[] users){
        if (users == null || users.length == 0){return null;}
        User[] uniqueUsers = new User[users.length];
        int uniqueUsersCount = 0;
        int rep;
        for (int i = 0; i < users.length; i++) {
            rep = 0;
            for (int j = 0; j < users.length; j++) {
                if ( (i != j) && users[i].equals(users[j])) {
                    rep++;
                }
            }
            if (rep == 0) {
                uniqueUsers[uniqueUsersCount++] = users[i];
            }
        }
        return Arrays.copyOf(uniqueUsers, uniqueUsersCount);
    }

    static User[] uniqueUsers2(User[] users){
        if (users == null || users.length == 0){return null;}

        int k = 0;
        int uniqueUsersCount = 0;
        int[] r = new int[users.length];

        for (int i = 0; i < users.length; i++) {
            if (r[i] == 0) {
                for (int j = 0; j < users.length; j++) {
                    if ( (i != j) && r[j] == 0 && users[i].equals(users[j])) {
                        r[i]++;
                        r[j]++;
                    }
                }
                if (r[i] == 0) {
                    r[i] = -1;
                    uniqueUsersCount++;
                }
            }
        }
        User[] uniqueUsers = new User[uniqueUsersCount];
        for (int i = 0; i < uniqueUsersCount ; i++) {
            if (r[i] == -1) {
                uniqueUsers[k] = users[i];
                k++;
            }
        }
        return uniqueUsers;
    }

    //user’s balance == balance
    static User[] usersWithContitionalBalance(User[] users, int balance){
        if (users == null || users.length == 0){return null;}

        User[] balanceUsers = new User[users.length];
        int balanceUsersCount = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getBalance() == balance) {
                balanceUsersCount++;
                balanceUsers[balanceUsersCount - 1] = users[i];
            }
        }
        return Arrays.copyOf(balanceUsers, balanceUsersCount);
    }

    static User[] paySalaryToUsers(User[] users){
        if (users == null || users.length == 0){return null;}

        //        users[5] = new User(6,"Natasha", "Petrova", 6000, 40000);
        for (int i = 0; i < users.length; i++) {
            users[i] = new User(users[i].getId(), users[i].getFirstName(),users[i].getLastName(), users[i].getSalary(),users[i].getBalance() + users[i].getSalary());
        }
        return users;
    }

    static long[] getUsersId(User[] users) {
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
            if ((users[i].getSalary() != 0) && (users[i].getBalance() != 0)) {
                notEmptyUsersCount++;
                notEmptyUsers[notEmptyUsersCount - 1] = users[i];
            }
        }
        return Arrays.copyOf(notEmptyUsers, notEmptyUsersCount);
    }
}
