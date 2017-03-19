package crazyjedi.homeWork6.UserTasks;

import java.util.Arrays;

/**
 * Created by Vlad on 05.03.2017.
 */
public class Demo {
    public static void main(String[] args) {
        User user1 = new User(1,"Charles","Chaplin", 1000, 2000);
        User user2 = new User(2,"Bob","Chaplin", 2000, 2000);
        User user3 = user1;
        User user4 = new User(1,"Charles","Chaplin", 1000, 2000);

        //Equals
        System.out.println(user1.equals(user2));
        System.out.println(user1.equals(user3));

        //Hash Code
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user3.hashCode());
        System.out.println(user4.hashCode());


        //Get non-null values
        System.out.println("Get non-null values");
        User[] userArray1 = new User[] {user1, user2, user3, null, null};
        userArray1 = UserUtils.deleteEmptyUsers(userArray1);
        System.out.println(Arrays.toString(userArray1));

        //Get unique users
        System.out.println("Get unique users");
        userArray1 = UserUtils.uniqueUsers(userArray1);
        System.out.println(Arrays.toString(userArray1));

        //Get users with balance == 2000
        System.out.println("Get users with balance == 2000");
        userArray1 = UserUtils.usersWithContitionalBalance(userArray1,2000);
        System.out.println(Arrays.toString(userArray1));

        //Pay salary
        System.out.println("Pay salary");
        userArray1 = UserUtils.paySalaryToUsers(userArray1);
        System.out.println(Arrays.toString(userArray1));

        //Get users with balance == 3000
        System.out.println("Get users with balance == 3000");
        userArray1 = UserUtils.usersWithContitionalBalance(userArray1,3000);
        System.out.println(Arrays.toString(userArray1));

        //Get user_id
        System.out.println("Get Users ID");
        userArray1 = new User[] {user1, user2, user3, null, null};
        System.out.println(Arrays.toString(UserUtils.getUsersId(userArray1)));

    }
}
