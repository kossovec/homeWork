package mihail_metel.homeWork06.Users;

/*
TASK 4
Create User class with fileds

long id
String firstName
lastName
int salary
int balance

and constructor with all fields.
*/

final class User {
    private long id;
    private String firstName;
    private String lastName;
    private int salary;
    private int balance;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != user.id) return false;
        if (salary != user.salary) return false;
        if (balance != user.balance) return false;
        if (!firstName.equals(user.firstName)) return false;
        return lastName.equals(user.lastName);
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + salary;
        result = 31 * result + balance;
        return result;
    }

    public User(long id, String firstName, String lastName, int salary, int balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public int getBalance() {
        return balance;
    }
}
