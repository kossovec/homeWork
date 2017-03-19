package dima_slav.homework06;

import java.util.Arrays;

public class UserMain {
    public static void main(String[] args) {
        User[] users = new User[4];
        users[0] = new User(123456L, "Kevin", "Block", 50, 300);
        users[1] = new User(123456L, "Kevin", "Block", 50, 300);
        users[2] = new User(0, "Sam", "Tui", 50, 1500);
        users[3] = new User(123456L, "Joe", "Garret", 50, 1500);

        System.out.println(Arrays.toString(users));
        System.out.println(Arrays.toString(UserUtils.uniqueUsers(users)));
        System.out.println(Arrays.toString(UserUtils.usersWithContitionalBalance(users, 300)));
        System.out.println(Arrays.toString(UserUtils.paySalaryToUsers(users)));
        System.out.println(Arrays.toString(UserUtils.getUsersId(users)));
        System.out.println(Arrays.toString(UserUtils.deleteEmptyUsers(users)));
    }
}
