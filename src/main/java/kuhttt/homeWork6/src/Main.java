import com.sun.org.apache.xpath.internal.SourceTree;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Asus on 30.03.2017.
 */
public class Main {

    public static void main(String[] args) {

        User user1 = new User(1, "Petya", "Rastorguev", 1000, 400000);
        User user2 = new User(2, "Vasya", "Pavlov", 1060, 423000);
        User user3 = new User(3, "Sveta", "Vasilieva", 4900, 547600);
        User user4 = new User(4, "Roma", "Svetlakov", 10, 0);
        User user5 = new User(5, "Masha", "Romanova", 4900, 487037);

        User[] users = {user1, user2, user3, user3, user4, user5};

        System.out.println("===== Unique users =====");
        System.out.println(Arrays.toString(UserUtils.uniqueUsers(users)));
        System.out.println("===== Users with specific balance =====");
        System.out.println(Arrays.toString(UserUtils.usersWithContitionalBalance(users, 4900)));
        System.out.println("===== Users ID =====");
        System.out.println(Arrays.toString(UserUtils.getUsersId(users)));
        System.out.println("===== Delete empty users =====");
        System.out.println(Arrays.toString(UserUtils.deleteEmptyUsers(users)));
        System.out.println("===== Pay salary to users =====");
        System.out.println(Arrays.toString(UserUtils.paySalaryToUsers(users)));

        int[] iArray = {1, 23, -45, 22, 209, 0, -33, 10, 8, -9};
        double[] dArray = {3.2, 4.88, -0.12, 444, 555, -4653.1, 5, 98, -75.333};
        System.out.println(
                "Sum for int = " + ArrausUtils.sum(iArray) + "\n" +
                        "Sum for double = " + ArrausUtils.sum(dArray) + "\n" +
                        "=============================" + "\n" +
                        "Max for int = " + ArrausUtils.max(iArray) + "\n" +
                        "Max for double = " + ArrausUtils.max(dArray) + "\n" +
                        "=============================" + "\n" +
                        "Min for int = " + ArrausUtils.min(iArray) + "\n" +
                        "Min for double = " + ArrausUtils.min(dArray) + "\n" +
                        "=============================" + "\n" +
                        "MaxPositive for int = " + ArrausUtils.maxPositive(iArray) + "\n" +
                        "MaxPositive for double = " + ArrausUtils.maxPositive(dArray) + "\n" +
                        "=============================" + "\n" +
                        "Multiplication for int = " + ArrausUtils.multiplication(iArray) + "\n" +
                        "Multiplication for double = " + ArrausUtils.multiplication(dArray) + "\n" +
                        "=============================" + "\n" +
                        "Modulus for int = " + ArrausUtils.modulus(iArray) + "\n" +
                        "Modulus for double = " + ArrausUtils.modulus(dArray) + "\n" +
                        "=============================" + "\n" +
                        "SecondLargest for int = " + ArrausUtils.secondLargest(iArray) + "\n" +
                        "SecondLargest for double = " + ArrausUtils.secondLargest(dArray)
        );


    }

}
