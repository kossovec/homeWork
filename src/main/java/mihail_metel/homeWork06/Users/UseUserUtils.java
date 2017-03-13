package homeWork06.Users;

/*TASK 6
Create Main class with main method where you need to create some test users and
demonstrate how every method from UserUtils work*/

public class UseUserUtils {

    public static void main(String[] args) {
        User[] users = new User[6];
        long[] idArray;

        users[0] = new User(1,"Petia", "Petrov", 5000, 30000);
        users[1] = new User(2,"Vasia", "Ivanov", 6000, 20000);
        users[2] = new User(3,"Kolia", "Nikolaev", 3000, 10000);
        users[3] = new User(4,"Sasha", "Aleksandrov", 0, 0);
        users[4] = new User(4,"Sasha", "Aleksandrov", 0, 0);
        users[5] = new User(6,"Natasha", "Petrova", 6000, 40000);


        System.out.println(UserUtils.uniqueUsers(users).length);

        System.out.println(UserUtils.usersWithContitionalBalance(users, 0).length);
        System.out.println(UserUtils.usersWithContitionalBalance(users, 10000).length);
        System.out.println(UserUtils.usersWithContitionalBalance(users, 20000).length);
        System.out.println(UserUtils.usersWithContitionalBalance(users, 30000).length);


        UserUtils.paySalaryToUsers(users);
        for (int i = 0; i < users.length; i++) {
            System.out.println("Balance of " + users[i].getFirstName() + users[i].getBalance());
        }

        idArray = UserUtils.getUsersId(users);
        for (long l : idArray) {
            System.out.println(l);
        }

        users = UserUtils.deleteEmptyUsers(users);
        for (int i = 0; i < users.length; i++) {
            System.out.println(i + " Balance of " + users[i].getFirstName() + " " + users[i].getBalance());
        }
        System.out.println("New users count is " + users.length);
    }
}
