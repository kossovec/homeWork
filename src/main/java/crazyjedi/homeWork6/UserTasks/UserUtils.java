package crazyjedi.homeWork6.UserTasks;

import java.util.Arrays;

/**
 * Created by Vlad on 05.03.2017.
 */
final public class UserUtils {

    private UserUtils() {
    }

    private static User[] addUserToArray(User[] array, User user) {
        User[] newArray = null;
        if (array == null) {
            newArray = new User[]{user};
        } else {
            newArray = Arrays.copyOf(array, array.length + 1);
            newArray[array.length] = user;
        }
        return newArray;
    }


    static User[] uniqueUsers(User[] users) {
        User currentUser = users[1];
        int currentUserIndex = 1;
        User[] uniqueUsersArray = new User[]{currentUser};
        for (int i = 1; i < users.length; i++) {
            currentUser = users[i];
            boolean notInUniqueArray = true;
            for (User user : uniqueUsersArray) {
                if (user.equals(currentUser)) {
                    notInUniqueArray = false;
                    break;
                }
            }
            if (notInUniqueArray) {
                uniqueUsersArray = addUserToArray(uniqueUsersArray, currentUser);
            }
        }
        return uniqueUsersArray;
    }

    //users are equal when all their field are equal
    static User[] usersWithContitionalBalance(User[] users, int balance) {
        User[] resultArray = null;
        for (User user : users) {
            if (user.getBalance() == balance) {
                resultArray = addUserToArray(resultArray, user);
            }
        }
        return resultArray;
    } //user’s balance == balance

    static User[] paySalaryToUsers(User[] users) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                continue;
            }
            if (users[i].getBalance() < 0) {
                throw new IllegalArgumentException(String.format("Salary of used %d is less then 0.", i));
            }
            users[i] = new User(users[i].getId(), users[i].getFirstName(), users[i].getLastName()
                    , users[i].getSalary(), users[i].getBalance()+users[i].getSalary());
        }
        return users;
    }

    private static int countNonNullUsers(User[] users) {
        int nonNullUsersCounter = 0;
        for (User user : users) {
            if (user != null) {
                nonNullUsersCounter++;
            }
        }
        return nonNullUsersCounter;
    }

    static long[] getUsersId(User[] users) {
        int nonNullUsersCounter = countNonNullUsers(users);

        long[] usersID = new long[nonNullUsersCounter];
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                usersID[i] = users[i].getId();
            }
        }
        return usersID;
    }

    static User[] deleteEmptyUsers(User[] users) {
        int nonNullUsersCounter = countNonNullUsers(users);
        User[] notEmptyUsers = new User[nonNullUsersCounter];
        for (int i = 0; i < users.length; i++) {
            User user = users[i];
            if (users[i] != null) {
                notEmptyUsers[i] = users[i];
            }
        }
        return notEmptyUsers;
    }


}
