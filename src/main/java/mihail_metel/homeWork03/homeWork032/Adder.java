package main.java.mihail_metel.homeWork03.homeWork032;

public class Adder extends Arithmetic{

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        Adder adder = new Adder();

        System.out.println(adder.add(a, b));
        System.out.println(adder.check(a, b));
    }

    public boolean check(Integer a, Integer b) {
        return a >= b;
    }

}
