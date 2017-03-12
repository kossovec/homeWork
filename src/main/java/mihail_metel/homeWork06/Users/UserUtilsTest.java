package homeWork06.Users;

import org.junit.Assert;
import org.junit.Test;

public class UserUtilsTest {
    User[] users = new User[6];

    {
        users[0] = new User(1,"Petia", "Petrov", 5000, 30000);
        users[1] = new User(2,"Vasia", "Ivanov", 6000, 20000);
        users[2] = new User(3,"Kolia", "Nikolaev", 3000, 10000);
        users[3] = new User(4,"Sasha", "Aleksandrov", 0, 0);
        users[4] = new User(4,"Sasha", "Aleksandrov", 0, 0);
        users[5] = new User(6,"Natasha", "Petrova", 6000, 40000);
    }

    @Test
    public void NullTest() throws Exception {
        Assert.assertNull(UserUtils.uniqueUsers(null));
        Assert.assertNull(UserUtils.usersWithContitionalBalance(null, 0));
        Assert.assertNull(UserUtils.paySalaryToUsers(null));
        Assert.assertNull(UserUtils.getUsersId(null));
        Assert.assertNull(UserUtils.deleteEmptyUsers(null));
    }

    @Test
    public void uniqueUsers() throws Exception {
        Assert.assertNull(UserUtils.uniqueUsers(null));
        Assert.assertEquals(4,UserUtils.uniqueUsers(users).length);
    }

    @Test
    public void usersWithContitionalBalance() throws Exception {
        Assert.assertEquals(2, UserUtils.usersWithContitionalBalance(users, 0).length);
        Assert.assertEquals(1, UserUtils.usersWithContitionalBalance(users, 10000).length);
        Assert.assertEquals(1, UserUtils.usersWithContitionalBalance(users, 20000).length);
        Assert.assertEquals(1, UserUtils.usersWithContitionalBalance(users, 30000).length);
    }

    @Test
    public void paySalaryToUsers() throws Exception {
        Assert.assertEquals(35000,UserUtils.paySalaryToUsers(users)[0].getBalance());
    }

    @Test
    public void getUsersId() throws Exception {
        Assert.assertEquals(users.length, UserUtils.getUsersId(users).length);
        Assert.assertEquals(1, UserUtils.getUsersId(users)[0]);
    }

    @Test
    public void deleteEmptyUsers() throws Exception {
        Assert.assertEquals(4, UserUtils.deleteEmptyUsers(users).length);

    }

}