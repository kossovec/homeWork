package dima_slav.homework03.Task4;


public class Main {
    public static void main(String[] args) {
        User newUser = new User("John" , 500, 6, "Google", 4500, "USD");

        newUser.paySalary(150);
        newUser.withdraw(10);
        System.out.println(newUser.companyNameLenght());
        newUser.monthIncreaser(7);
    }
}
